package ru.ifmo.generator;

import ru.ifmo.antlr.GrammarBaseListener;
import ru.ifmo.antlr.GrammarParser;
import ru.ifmo.lexer.Token;
import ru.ifmo.rule.*;

import java.util.*;
import java.util.stream.Collectors;

public class GrammarWalker extends GrammarBaseListener {

    public final Map<String, Rule> nonTermRules = new HashMap<>();
    public Rule startRule;

    public final LinkedHashMap<String, Token> tokensRepresentation = new LinkedHashMap<>();
    public final Map<String, Token> skippedTokens = new HashMap<>();

    @Override
    public void exitTokenize(GrammarParser.TokenizeContext ctx) {
        String termText = ctx.TERMINAL().getText();
        String termVal = ctx.val.getText();
        boolean isRegex = termVal.charAt(0) == '\'';
        termVal = termVal.substring(1, termVal.length() - 1);
        if (ctx.FROM() != null) {
            tokensRepresentation.putIfAbsent(termText, new Token(termText, termVal, isRegex));
        } else {
            skippedTokens.putIfAbsent(termText, new Token(termText, termVal, isRegex));
        }
    }

    @Override
    public void exitRules(GrammarParser.RulesContext ctx) {
        String nonTermText = ctx.NONTERMINAL().getText();
        nonTermRules.putIfAbsent(nonTermText, new Rule(nonTermText));
        Rule rule = nonTermRules.get(nonTermText);
        if (startRule == null) {
            startRule = rule;
        }
        if (ctx.attrs() != null) {
            rule.setAttrs(handleAttributes(ctx.attrs()));
        }
        if (ctx.return_() != null) {
            rule.setReturns(new Attribute(getAttrType(ctx),
                    ctx.return_().attr().NONTERMINAL().getText()));
        }
        rule.addOut(handleRuleOut(ctx.ruleout()));
        for (GrammarParser.Ruleout_tailContext rCtx : ctx.ruleout_tail()) {
            rule.addOut(handleRuleOut(rCtx.ruleout()));
        }
    }

    private Out handleRuleOut(GrammarParser.RuleoutContext rCtx) {
        if (rCtx.EPS() != null) {
            String actionCode = "";
            if (rCtx.ACTION() != null) {
                actionCode = rCtx.ACTION().getText();
            }
            return new Out(List.of(new Eps(actionCode)));
        }
        List<GrammarParser.Type_with_argsContext> outs = rCtx.type_with_args();
        return new Out(outs.stream().map(o -> {

            if (o.NONTERMINAL() != null) {
                if (o.args() != null) {
                    if (o.ACTION() != null) {
                        return new NonTerminal(o.NONTERMINAL().getText(), handleArgs(o.args()), o.ACTION().getText());
                    } else {
                        return new NonTerminal(o.NONTERMINAL().getText(), handleArgs(o.args()));
                    }
                } else {
                    if (o.ACTION() != null) {
                        return new NonTerminal(o.NONTERMINAL().getText(), o.ACTION().getText());
                    } else {
                        return new NonTerminal(o.NONTERMINAL().getText());
                    }
                }
            } else {
                if (o.args() != null) {
                    if (o.ACTION() != null) {
                        return new Terminal(o.TERMINAL().getText(), handleArgs(o.args()), o.ACTION().getText());
                    } else {
                        return new Terminal(o.TERMINAL().getText(), handleArgs(o.args()));
                    }
                } else {
                    if (o.ACTION() != null) {
                        return new Terminal(o.TERMINAL().getText(), o.ACTION().getText());
                    } else {
                        return new Terminal(o.TERMINAL().getText());
                    }
                }
            }
        }).collect(Collectors.toList()));
    }

    private List<Attribute> handleAttributes(GrammarParser.AttrsContext aCtx) {
        List<Attribute> attrs = new ArrayList<>();
        attrs.add(new Attribute(getSafeType(aCtx.attr().type()), aCtx.attr().NONTERMINAL().getText()));
        aCtx.attr_tail().forEach(a -> attrs.add(new Attribute(a.attr().type().TERMINAL().getText(), a.attr().NONTERMINAL().getText())));
        return attrs;
    }

    private List<String> handleArgs(GrammarParser.ArgsContext aCtx) {
        List <String> result = new ArrayList<>();
        result.add(getSafeArg(aCtx.arg()));
        aCtx.args_tail().forEach(a -> result.add(getSafeArg(a.arg())));
        return result;
    }

    private String getSafeArg(GrammarParser.ArgContext aCtx) {
        if (aCtx.type() != null) {
            return aCtx.type().getText();
        } else {
            return aCtx.ACTION().getText();
        }
    }

    private String getAttrType(GrammarParser.RulesContext ctx) {
        GrammarParser.TypeContext tt = ctx.return_().attr().type();
        if (tt.TERMINAL() != null) {
            return tt.TERMINAL().getText();
        } else {
            return tt.NONTERMINAL().getText();
        }
    }

    private String getSafeType(GrammarParser.TypeContext ctx) {
        if (ctx.NONTERMINAL() != null) {
            return ctx.NONTERMINAL().getText();
        } else {
            return ctx.TERMINAL().getText();
        }
    }

}
