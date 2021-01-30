package ru.ifmo.generator;

import ru.ifmo.rule.*;

import java.util.*;
import java.util.stream.Collectors;

public class ParserGenerator {

    private final GrammarWalker walker;
    public final HashMap<String, Set<String>> first = new HashMap<>();
    public final HashMap<String, Set<String>> follow = new HashMap<>();

    public ParserGenerator(GrammarWalker walker) {
        this.walker = walker;
    }

    public void computeFirst() {
        first.put(Eps.EPS.getName(), new HashSet<>());
        for (String term : walker.tokensRepresentation.keySet()) {
            first.put(term, new HashSet<>());
            first.get(term).add(new Terminal(term).getName());
        }
        for (String nonTerm: walker.nonTermRules.keySet()) {
            first.put(nonTerm, new HashSet<>());
            for (Out out : walker.nonTermRules.get(nonTerm).getOuts()) {
                if (out.getParts().get(0).getName().equals(Eps.EPS.getName())) {
                    first.get(nonTerm).add(Eps.EPS.getName());
                } else if (out.getParts().get(0) instanceof Terminal) {
                    first.get(nonTerm).add(out.getParts().get(0).getName());
                }
            }
        }
        boolean changes = true;
        while (changes) {
            changes = false;
            for (String nonTerm : walker.nonTermRules.keySet()) {
                int curSize = first.get(nonTerm).size();
                Rule rule = walker.nonTermRules.get(nonTerm);
                for (Out out : rule.getOuts()) {
                    List<Out.OutPart> parts = out.getParts();
                    first.get(nonTerm).addAll(first.get(parts.get(0).getName()));
                }
                if (curSize != first.get(nonTerm).size()) {
                    changes = true;
                }
            }
        }
    }

    public void computeFollow() {
        for (String nonTerm : walker.nonTermRules.keySet()) {
            follow.put(nonTerm, new HashSet<>());
        }
        follow.put(walker.startRule.getNonTerm(), new HashSet<>());
        follow.get(walker.startRule.getNonTerm()).add(End.END.getName());
        boolean changes = true;
        while (changes) {
            changes = false;
            for (String nonTerm : walker.nonTermRules.keySet()) {
                Rule rule = walker.nonTermRules.get(nonTerm);
                for (Out out : rule.getOuts()) {
                    List<Out.OutPart> parts = out.getParts();
                    if (parts.get(parts.size() - 1) instanceof NonTerminal &&  // A->aB : F(B)+=F(A)
                        follow.get(parts.get(parts.size() - 1).getName()).addAll(follow.get(nonTerm))) {
                        changes = true;
                    }
                    if (first.get(parts.get(parts.size() - 1).getName()).contains(Eps.EPS.getName()) && // A->aBb, F(B)+=F(A) (if eps in first(a))
                            parts.size() - 2 >= 0 && parts.get(parts.size() - 2) instanceof NonTerminal &&
                            follow.get(parts.get(parts.size() - 2)
                                    .getName())
                                    .addAll(follow.get(nonTerm))) {
                            changes = true;
                        }
                    for (int i = 0; i < parts.size() - 1; i++) {
                        if (!(parts.get(i) instanceof NonTerminal)) {
                            continue;
                        }
                        for (String part : first.get(parts.get(i + 1).getName())) {
                            if (part.equals(Eps.EPS.getName())) {
                                continue;
                            }
                            if (follow.get(parts.get(i).getName()).add(part)) {
                                changes = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public void checkLL1() throws GrammarException {
        for (String nonTerm : walker.nonTermRules.keySet()) {
            Rule rule = walker.nonTermRules.get(nonTerm);
            List<Out> outs = rule.getOuts();
            int outsSz = outs.size();
            for (int i = 0; i < outsSz; i++) {
                for (int j = 0; j < outsSz; j++) {
                    if (i == j) {
                        continue;
                    }
                    var fa = first.get(outs.get(i).getParts().get(0).getName());
                    var fb = first.get(outs.get(j).getParts().get(0).getName());
                    for (var f : fa) {
                        if (fb.contains(f)) {
                            throw new GrammarException("\nERROR: Not LL1. :\n\t1) " +
                                nonTerm + " -> " + outs.get(i).getParts().toString() + "\n\t2) " +
                                nonTerm + " -> " + outs.get(j).getParts().toString() + "\n\t" +
                                "FIRST(1) contains \"" + f + "\" and FIRST(2) contains \"" + f + "\"\n");
                        }
                    }
                    if (fa.contains(Eps.EPS.getName())) {
                        var followA = follow.get(nonTerm);
                        for (var f : followA) {
                            if (fb.contains(f)) {
                                throw new GrammarException("\nERROR: Not LL1. :\n\t1) " +
                                        nonTerm + " -> " + outs.get(i).getParts().toString() + "\n\t2) " +
                                        nonTerm + " -> " + outs.get(j).getParts().toString() + "\n\t" +
                                        "FIRST(1) contains eps: " +
                                        "FOLLOW(1) contains \"" + f + "\" and FIRST(2) contains \"" + f + "\"\n");
                            }
                        }
                    }
                 }
            }
        }
    }

    private String generateParserStart() {
        return "    public Tree parse() throws ParseException {\n" +
                "        lexer.nextToken();\n" +
                "        Tree result = " +
                            walker.startRule.getNonTerm().toUpperCase() + "();\n" +
                "        if (lexer.curToken() != Token.END) {\n" +
                "            currentError(Token.END);\n" +
                "        }\n" +
                "        return result;\n" +
                "    }\n";
    }

    private String generateNonTerminalParser(Rule rule) {
        StringBuilder result =
                new StringBuilder("public Tree " + rule.getNonTerm().toUpperCase() + "(" + generateAttrs(rule) + ") throws ParseException {\n" +
                        "    Tree result = new Tree(\"" + rule.getNonTerm().toUpperCase() + "\");\n" +
                        "    String currentLocalWord = lexer.curWord();\n" +
                        "    switch (lexer.curToken().getName()) {\n");
        for (Out out : rule.getOuts()) {
            Set<String> switched = follow.get(rule.getNonTerm());
            List<Out.OutPart> parts = out.getParts();
            if (!parts.get(0).getName().equals(Eps.EPS.getName())) {
                switched = first.get(parts.get(0).getName());
            }
            switched = switched.stream().map(s -> "\"" + s + "\"").collect(Collectors.toSet());
            var cases = new StringBuilder("        case " + String.join(", ", switched) + " -> {\n");
            for (Out.OutPart p : parts) {
                if (p instanceof Terminal) {
                    cases.append("            result.addChild(new Tree(\"").append(p.getName().toUpperCase()).append("\"));\n");
                } else if (p instanceof NonTerminal) {
                    cases.append("            ").append("Tree").append(' ').append(p.getName()).append(";\n");
                }
            }
            for (Out.OutPart p : parts) {
                if (p instanceof  Terminal) {
                    cases.append("            ").append("lexer.nextToken();\n");
                    addPossibleAction(cases, p);
                } else if (p instanceof NonTerminal) {
                    cases.append("            ").append(p.getName()).append(" = ")
                            .append(p.getName().toUpperCase()).append('(');
                    cases.append(p.getArgs().stream().map(a -> {
                        if (a.startsWith("{") && a.endsWith("}")) {
                            return formatAction(a);
                        }
                        return a;
                    }).collect(Collectors.joining(", ")));
                    cases.append(')').append(';').append('\n');
                    addPossibleAction(cases, p);
                    cases.append("            ").append("result.addChild(").append(p.getName()).append(");\n");
                } else {
                    addPossibleAction(cases, p);
                }
            }
            cases.append("        ").append("}\n");
            result.append(cases.toString());
        }
        result.append("        ").append("default -> currentError();\n");
        return result + "    }\n    return result;\n}\n";
    }

    private String generateAttrs(Rule rule) {
        if (rule.getAttrs() == null) {
            return "";
        }
        return rule.getAttrs().stream().map(a -> a.getType() + ' ' + a.getName()).collect(Collectors.joining(", "));
    }

    public String generate() throws GrammarException {
        computeFirst();
        computeFollow();
        checkLL1();
        return "package ru.ifmo.parser;\n" +
                "\n" +
                "import ru.ifmo.lexer.Token;\n" +
                "import ru.ifmo.lexer.Lexer;\n" +
                "\n" +
                "import java.io.ByteArrayInputStream;\n" +
                "import java.io.InputStream;\n" +
                "import java.text.ParseException;\n" +
                "import java.util.Arrays;\n" +
                "import java.util.stream.Collectors;\n" +
                "\n" +
                "public class Parser {\n" +
                "    private final Lexer lexer;\n" +
                "\n" +
                "    public Parser(InputStream input) throws ParseException {\n" +
                "        lexer = new Lexer(input);\n" +
                "    }\n" +
                "\n" +
                "    public Parser(String input) throws ParseException {\n" +
                "        lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));\n" +
                "    }\n" +
                "\n" +
                generateParserStart() +
                "\n" +
                "    private void currentError(Token... expected) throws ParseException {\n" +
                "        throw new ParseException(\n" +
                "                \"Unexpected token: expected [\" +\n" +
                "                        Arrays.stream(expected).map(Token::toString).collect(Collectors.joining(\"|\")) +\n" +
                "                        \"], actual \" + lexer.curToken().toString(),\n" +
                "                lexer.curPos());\n" +
                "    }\n" +
                "\n" +
                addTab(walker.nonTermRules
                        .values()
                        .stream()
                        .map(this::generateNonTerminalParser)
                        .collect(Collectors.joining("\n"))) +
                "\n" + "}\n";
    }

    public String generateTree() {
        return "package ru.ifmo.parser;\n" +
                "\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.List;\n" +
                "\n" +
                "public class Tree {\n" +
                "    private final String name;\n" +
                "    private final List<Tree> children = new ArrayList<>();\n" +
                "    public " + walker.startRule.getReturns().getType() + " " + walker.startRule.getReturns().getName() + ";\n" +
                "    \n" +
                "    public Tree(String name) {\n" +
                "        this.name = name;\n" +
                "    }\n" +
                "    \n" +
                "    public String getName() {\n" +
                "        return name;\n" +
                "    }\n" +
                "    \n" +
                "    public List<Tree> getChildren() {\n" +
                "        return children;\n" +
                "    }\n" +
                "    \n" +
                "    public void addChild(Tree child) {\n" +
                "        children.add(child);\n" +
                "    }\n" +
                "    \n" +
                "    public void addChild(String childName) {\n" +
                "        children.add(new Tree(childName));\n" +
                "    }\n" +
                "}\n";
    }

    private String addTab(String input) {
        return Arrays.stream(input.split("\n")).map(i -> "    " + i).collect(Collectors.joining("\n"));
    }

    private void addPossibleAction(StringBuilder cases, Out.OutPart p) {
        String action = formatAction(p.getAction());
        if (!action.isEmpty()) {
            cases.append("            ").append(action).append('\n');
        }
    }

    private String formatAction(String action) {
        if (action.isEmpty()) {
            return action;
        }
        if (action.charAt(0) == '{' && action.charAt(action.length() - 1) == '}') {
            action = action.substring(1, action.length() - 1);
        }
        action = action
                .replaceAll("@@", "currentLocalWord")
                .replaceAll("\\$", "result.");
        return action;
    }

}
