package ru.ifmo.generator;

import ru.ifmo.lexer.Token;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class LexerGenerator {

    private final String staticTokens;
    private final String staticSkippedRegexes;

    public LexerGenerator(GrammarWalker walker) {

        staticTokens =
                "    private static final LinkedHashMap<String, Token> tokensRepresentation = new LinkedHashMap<>();\n"  +
                        "    static {\n" +
                        walker.tokensRepresentation
                                .entrySet()
                                .stream()
                                .map(kv -> "        tokensRepresentation.put(\"" + kv.getKey() +
                                        "\", new Token(\"" +
                                        kv.getKey() + "\", \"" +
                                        kv.getValue().getValue() + "\", " + kv.getValue().isRegex() + "));")
                                .collect(Collectors.joining("\n")) + "\n" +
                        "    }\n\n";
        staticSkippedRegexes =
                "    private static final List<String> skippedRegexes = List.of(\n" +
                        walker.skippedTokens
                                .values()
                                .stream()
                                .map(token -> "        \"" + token.getValue() + "\"")
                                .collect(Collectors.joining(", ")) + "\n" +
                        "        );\n";
    }

    private String matchRegexes() {
        return  "    private boolean matchRegexes(String toCheck) {\n" +
                "        return Lexer.skippedRegexes.stream().anyMatch(toCheck::matches);\n" +
                "    }\n";
    }

    private String skipSpecialTokens() {
        return  "    private void skip() throws ParseException {\n" +
                "        while (!isEnd && matchRegexes(String.valueOf(curChar))) {\n" +
                "            nextChar();\n" +
                "        }\n" +
                "    }\n";
    }

    public String generate() {
        return  "package ru.ifmo.lexer;\n\n" +
                "import java.io.IOException;\n" +
                "import java.io.InputStream;\n" +
                "import java.text.ParseException;\n" +
                "import java.util.LinkedHashMap;\n" +
                "import java.util.regex.Matcher;\n" +
                "import java.util.regex.Pattern;\n" +
                "import java.util.List;\n" +
                "\n" +
                "public class Lexer {\n" +
                "    private final InputStream input;\n" +
                "    private char curChar;\n" +
                "    private String curWord;\n" +
                "    private int curPos =0 ;\n" +
                "    private Token curToken;\n" +
                "    private boolean isEnd = false;\n\n" +
                staticTokens +
                staticSkippedRegexes +
                "\n" +
                "    public Lexer(InputStream input) throws ParseException {\n" +
                "        this.input = input;\n" +
                "        nextChar();\n" +
                "    }\n" +
                "\n" +
                "    private void nextChar() throws ParseException {\n" +
                "        curPos++;\n" +
                "        try {\n" +
                "            int read = input.read();\n" +
                "            if (read == -1) {\n" +
                "                isEnd = true;\n" +
                "            } else {\n" +
                "                curChar = (char) read;\n" +
                "                curWord = String.valueOf(curChar);\n" +
                "            }\n" +
                "        } catch (IOException e) {\n" +
                "            throw new ParseException(e.getMessage(), curPos);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                skipSpecialTokens() +
                "\n" +
                "    public void nextToken() throws ParseException {\n" +
                "        skip();\n" +
                "        if (isEnd) {\n" +
                "            curToken = Token.END;\n" +
                "            return;\n" +
                "        }\n" +
                "        StringBuilder tokenStr = new StringBuilder();\n" +
                "        for (Token k : tokensRepresentation.values()) {\n" +
                "            if (!k.isRegex()) {\n" +
                "                if (k.getValue().charAt(0) == curChar) {\n" +
                "                    tokenStr.append(curChar);\n" +
                "                    nextChar();\n" +
                "                    for (int i = 1; i < k.getValue().length(); i++) {\n" +
                "                        tokenStr.append(curChar);\n" +
                "                        if (isEnd || k.getValue().charAt(i) != curChar) {\n" +
                "                            throw new ParseException(\"Illegal characters: \" + tokenStr.toString(), curPos);\n" +
                "                        }\n" +
                "                        nextChar();\n" +
                "                    }\n" +
                "                    curWord = tokenStr.toString();\n" +
                "                    curToken = k;\n" +
                "                    return;\n" +
                "                }\n" +
                "                continue;\n" +
                "            }\n" +
                "            Pattern pattern = Pattern.compile(k.getValue());\n" +
                "            Matcher matcher = pattern.matcher(String.valueOf(curChar));\n" +
                "            if (matcher.find()) {\n" +
                "                while (!isEnd && tokenStr.append(curChar).toString().matches(k.getValue())) {\n" +
                "                    nextChar();\n" +
                "                }\n" +
                "                if (!isEnd) {\n" +
                "                   tokenStr.deleteCharAt(tokenStr.length() - 1);\n" +
                "                }\n" +
                "                curWord = tokenStr.toString();\n" +
                "                curToken = k;\n" +
                "                return;\n" +
                "            }\n" +
                "        }\n" +
                "        throw new ParseException(\"Illegal characters: \" + curWord, curPos);\n" +
                "    }\n" +
                "\n" +
                "    public Token curToken() {\n" +
                "        return curToken;\n" +
                "    }\n" +
                "\n" +
                "    public int curPos() {\n" +
                "        return curPos;\n" +
                "    }\n" +
                "\n" +
                "    public String curWord() {\n" +
                "        return curWord;\n" +
                "    }\n" +
                "\n" +
                matchRegexes() +
                "\n" +
                "}\n";
    }

    private void sss(LinkedHashMap<String, Token> tokensRepresentation, char curChar, boolean isEnd) {

    }
}
