grammar CPP;

global returns [StringBuilder val]
    :   {$val = new StringBuilder();}
        (
            global_action {$val.append($global_action.val);}
        )*
    ;

global_action returns [StringBuilder val]
    : func                      {$val = new StringBuilder($func.val);}
    | var_declaration SEMICOLON {$val = new StringBuilder($var_declaration.val)
                                        .append($SEMICOLON.getText()).append('\n');}
    ;

func returns [StringBuilder val]
    :  type IDENTIFIER LP signature RP BEGIN actions[1] END
        {   $val = new StringBuilder();
            $val.append($type.val)
                .append(' ')
                .append($IDENTIFIER.getText())
                .append($LP.getText())
                .append($signature.val)
                .append($RP.getText())
                .append(' ')
                .append($BEGIN.getText())
                .append('\n')
                .append($actions.val)
                .append($END.getText())
                .append('\n');
        }
    ;

actions[int tabs] returns [StringBuilder val]
    :   {$val = new StringBuilder();}
        (action[tabs] {
            for (int i = 0; i < tabs; i++) $val.append('\t');
            $val.append($action.val);
        })*
    ;

action[int tabs] returns [StringBuilder val]
    : for_[tabs]                {$val = new StringBuilder($for_.val);                    }
    | swi[tabs]                 {$val = new StringBuilder($swi.val);}
    | if_[tabs]                 {$val = new StringBuilder($if_.val);                     }
    | while_[tabs]              {$val = new StringBuilder($while_.val);                  }
    | return_                   {$val = new StringBuilder($return_.val);                 }
    | var_declaration SEMICOLON {$val = new StringBuilder($var_declaration.val)
                                    .append($SEMICOLON.getText()).append('\n');          }
    | modify          SEMICOLON {$val = new StringBuilder().append($modify.val)
                                    .append($SEMICOLON.getText()).append('\n');          }
    | funcInvoke      SEMICOLON {$val = new StringBuilder($funcInvoke.val).append(";\n");}
    ;

swi[int tabs] returns [StringBuilder val]
    : 'switch' '(' expr ')' '{'
        {
        $val = new StringBuilder();
        $val.append("switch (").append($expr.val).append(") {\n").append(' ');
        }
        (
            cas[tabs + 1] {
                $val.append($cas.val);
            }
        )+ '}'
        {
        for (int i = 0; i < tabs; i++) $val.append('\t');
        $val.append("}\n");
        }
    ;

cas[int tabs] returns [StringBuilder val]
    : 'case' expr ':' actions[tabs + 1] 'break' ';' {
        $val = new StringBuilder();
        for (int i = 0; i < tabs; i++) $val.append('\t');
        $val.append("case ")
            .append($expr.val)
            .append(":\n")
            .append($actions.val);

        for (int i = 0; i < tabs; i++) $val.append('\t');
        $val.append("break")
            .append(";\n");
    }
    ;

var_declaration returns [StringBuilder val]
    : type (IDENTIFIER | assignment)
        {   $val = new StringBuilder().append($type.val).append(' ');
            if ($IDENTIFIER != null) $val.append($IDENTIFIER.getText()); else $val.append($assignment.val);
        }
    ;

modify returns [StringBuilder val]
    : IDENTIFIER mod=(MODIFY|ASSIGN) expr
        {   $val = new StringBuilder()
                .append($IDENTIFIER.getText())
                .append(' ')
                .append($mod.getText())
                .append(' ')
                .append($expr.val);
        }
    ;

assignment returns [StringBuilder val]
    : IDENTIFIER ASSIGN expr
        {   $val = new StringBuilder()
                .append($IDENTIFIER.getText())
                .append(' ')
                .append($ASSIGN.getText())
                .append(' ')
                .append($expr.val);
        }
    ;

return_ returns [StringBuilder val]
    : RETURN expr SEMICOLON
        {   $val = new StringBuilder()
                .append($RETURN.getText())
                .append(' ')
                .append($expr.val)
                .append($SEMICOLON.getText())
                .append('\n');
        }
    ;

for_[int tabs] returns [StringBuilder val]
    : FOR LP assignment SEMICOLON expr SEMICOLON modify RP BEGIN actions[tabs + 1] END
        {   $val = new StringBuilder()
                .append($FOR.getText())
                .append(' ')
                .append($LP.getText())
                .append($assignment.val)
                .append($SEMICOLON.getText())
                .append(' ')
                .append($expr.val)
                .append($SEMICOLON.getText())
                .append(' ')
                .append($modify.val)
                .append($RP.getText())
                .append(' ')
                .append($BEGIN.getText())
                .append('\n')
                .append($actions.val);
            for (int i = 0; i < tabs; i++) $val.append('\t');
            $val.append($END.getText()).append('\n');
        }
    ;

while_[int tabs] returns [StringBuilder val]
    : WHILE LP expr RP BEGIN actions[tabs + 1] END
        {   $val = new StringBuilder();
            $val.append($WHILE.getText())
                .append(' ')
                .append($LP.getText())
                .append($expr.val)
                .append($RP.getText())
                .append(' ')
                .append($BEGIN.getText())
                .append('\n')
                .append($actions.val);
            for (int i = 0; i < tabs; i++) $val.append('\t');
            $val.append($END.getText()).append('\n');
        }
    ;

if_[int tabs] returns [StringBuilder val]
    : IF LP expr RP BEGIN actions[tabs + 1] END
        {   $val = new StringBuilder();
            $val.append($IF.getText())
                .append(' ')
                .append($LP.getText())
                .append($expr.val)
                .append($RP.getText())
                .append($BEGIN.getText())
                .append('\n')
                .append($actions.val);
            for (int i = 0; i < tabs; i++) $val.append('\t');
            $val.append($END.getText()).append('\n');
        }
    ;

expr returns [StringBuilder val]
    : IDENTIFIER       {$val = new StringBuilder($IDENTIFIER.getText());      }
    | PRIMITIVE_VALUES {$val = new StringBuilder($PRIMITIVE_VALUES.getText());}
    | funcInvoke       {$val = new StringBuilder($funcInvoke.val);            }
    | l=expr OPERATORS r=expr
        { $val = new StringBuilder()
            .append($l.val)
            .append(' ')
            .append($OPERATORS.getText())
            .append(' ')
            .append($r.val);
        }
    | LP expr RP       {$val = new StringBuilder($LP.getText()).append($expr.val).append($RP.getText());}
    ;

funcInvoke returns [StringBuilder val]
    : IDENTIFIER
        LP           {$val = new StringBuilder($IDENTIFIER.getText() + $LP.getText());}
        passedArgs   {$val.append($passedArgs.val);                         }
        RP           {$val.append($RP.getText());                                     }
    ;

passedArgs returns [StringBuilder val]
    :   {$val = new StringBuilder();}
        (
            expr {$val.append($expr.val);}
            (
                COMMA expr
                {
                    $val.append(", ").append($expr.val);
                }
            )*
        )?
    ;

signature returns [StringBuilder val]
    :   {$val = new StringBuilder();}
        (
             type IDENTIFIER {$val.append($type.val).append(' ').append($IDENTIFIER.getText());}
             (
                 COMMA type IDENTIFIER
                 {
                     $val.append($COMMA.getText()).append(' ').append($type.val).append(' ').append($IDENTIFIER.getText());
                 }
             )*
        )?
    ;

type returns [String val]
    : ANY_TYPE   {$val = $ANY_TYPE.getText().replaceAll("( )", "").trim();}
    ;

ANY_TYPE
    : PRIMITIVE_TYPE [ *]*
    ;

PRIMITIVE_TYPE
    : 'int'
    | 'double'
    | 'void'
    | 'bool'
    | 'char'
    ;

RETURN : 'return' ;

FOR   : 'for'   ;
WHILE : 'while' ;
IF    : 'if'    ;

PRIMITIVE_VALUES
    : STRING
    | NUMBER
    | BOOL
    ;

STRING : '"'.*?'"' ;
NUMBER : [0-9]+    ;
BOOL
    : 'true'
    | 'false'
    ;

IDENTIFIER : [A-Za-z_] [A-Za-z0-9_]* ;
OPERATORS
    : '+'
    | '-'
    | '*'
    | '/'
    | '%'
    | '<'
    | '>'
    | '<='
    | '>='
    | '=='
    | '!='
    | '||'
    | '&&'
    | '&'
    | '|'
    | '^'
    ;
SEMICOLON : ';' ;
ASSIGN : '=' ;
MODIFY
    : '+='
    | '-='
    | '*='
    | '/='
    | '%='
    | '&='
    | '^='
    | '|='
    ;

COMMA : ',' ;
LP : '(' ;
RP : ')' ;
BEGIN : '{' ;
END   : '}' ;

WS  : [ \t\r\n]+ -> skip ;
