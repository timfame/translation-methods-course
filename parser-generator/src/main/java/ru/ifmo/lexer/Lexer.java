package ru.ifmo.lexer;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class Lexer {
    private final InputStream input;
    private char curChar;
    private String curWord;
    private int curPos =0 ;
    private Token curToken;
    private boolean isEnd = false;

    private static final LinkedHashMap<String, Token> tokensRepresentation = new LinkedHashMap<>();
    static {
        tokensRepresentation.put("AND", new Token("AND", "and", false));
        tokensRepresentation.put("OR", new Token("OR", "or", false));
        tokensRepresentation.put("XOR", new Token("XOR", "xor", false));
        tokensRepresentation.put("NOT", new Token("NOT", "not", false));
        tokensRepresentation.put("TRUE", new Token("TRUE", "true", false));
        tokensRepresentation.put("FALSE", new Token("FALSE", "false", false));
        tokensRepresentation.put("LP", new Token("LP", "(", false));
        tokensRepresentation.put("RP", new Token("RP", ")", false));
    }

    private static final List<String> skippedRegexes = List.of(
        "[ \t\r\n]+"
        );

    public Lexer(InputStream input) throws ParseException {
        this.input = input;
        nextChar();
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            int read = input.read();
            if (read == -1) {
                isEnd = true;
            } else {
                curChar = (char) read;
                curWord = String.valueOf(curChar);
            }
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    private void skip() throws ParseException {
        while (!isEnd && matchRegexes(String.valueOf(curChar))) {
            nextChar();
        }
    }

    public void nextToken() throws ParseException {
        skip();
        if (isEnd) {
            curToken = Token.END;
            return;
        }
        StringBuilder tokenStr = new StringBuilder();
        for (Token k : tokensRepresentation.values()) {
            if (!k.isRegex()) {
                if (k.getValue().charAt(0) == curChar) {
                    tokenStr.append(curChar);
                    nextChar();
                    for (int i = 1; i < k.getValue().length(); i++) {
                        tokenStr.append(curChar);
                        if (isEnd || k.getValue().charAt(i) != curChar) {
                            throw new ParseException("Illegal characters: " + tokenStr.toString(), curPos);
                        }
                        nextChar();
                    }
                    curWord = tokenStr.toString();
                    curToken = k;
                    return;
                }
                continue;
            }
            Pattern pattern = Pattern.compile(k.getValue());
            Matcher matcher = pattern.matcher(String.valueOf(curChar));
            if (matcher.find()) {
                while (!isEnd && tokenStr.append(curChar).toString().matches(k.getValue())) {
                    nextChar();
                }
                if (!isEnd) {
                   tokenStr.deleteCharAt(tokenStr.length() - 1);
                }
                curWord = tokenStr.toString();
                curToken = k;
                return;
            }
        }
        throw new ParseException("Illegal characters: " + curWord, curPos);
    }

    public Token curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos;
    }

    public String curWord() {
        return curWord;
    }

    private boolean matchRegexes(String toCheck) {
        return Lexer.skippedRegexes.stream().anyMatch(toCheck::matches);
    }

}
