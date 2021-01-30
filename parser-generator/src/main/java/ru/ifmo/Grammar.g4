grammar Grammar;


parseAllGrammar
    :
    'Lexer:' tokenize+
    'Parser:' rules+
    ;

tokenize
    : TERMINAL FROM val=(CONST | REGEX) SEP
    | TERMINAL SKI  val=(CONST | REGEX) SEP
    ;

CONST : '"' ~["]* '"' ;
REGEX : '\'' ( ~[\r\n\t'] | ('\\\'') )* '\'' ;

rules
    : NONTERMINAL attrs? return_? TO ruleout ruleout_tail* SEP
    ;

return_
    : RETURNS '[' attr ']'
    ;

attrs
    : '[' attr attr_tail* ']'
    ;

attr_tail
    : ',' attr
    ;

attr
    : type NONTERMINAL
    ;

ruleout_tail
    : OR ruleout
    ;

ruleout
    : type_with_args+
    | EPS ACTION?
    ;

type_with_args
    : NONTERMINAL args? ACTION?
    | TERMINAL ACTION?
    ;

args
    : '[' arg args_tail* ']'
    ;

args_tail
    : ',' arg
    ;

arg
    : type
    | ACTION
    ;

type
    : TERMINAL
    | NONTERMINAL
    ;

SEP : ';' ;

RETURNS : 'returns' ;

SKI  : '<<' ;
FROM : '<-' ;

TO : '->' ;
OR : '|'  ;

EPS         : 'eps'               ;
TERMINAL    : [A-Z] [a-zA-Z0-9_]* ;
NONTERMINAL : [a-z] [a-zA-Z0-9_]* ;

ACTION : '{' ~[{}]* '}' ;

WS : [ \t\r\n]+ -> skip ;