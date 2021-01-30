package ru.ifmo.lexer;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

public class Lexer {
    private final InputStream input;
    private char curChar;
    private String curWord;
    private int curPos =0 ;
    private Token curToken;
    private boolean isEnd = false;

    private static final Map<String, Token> tokensRepresentation = Map.of(
            "and", Token.AND,
            "xor", Token.XOR,
            "or", Token.OR,
            "not", Token.NOT
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

    private void skipWhiteSpaces() throws ParseException {
        while (!isEnd && Character.isWhitespace(curChar)) {
            nextChar();
        }
    }

    public void nextToken() throws ParseException {
        skipWhiteSpaces();
        if (isEnd) {
            curToken = Token.END;
            return;
        }
        switch (curChar) {
            case '(' -> {
                nextChar();
                curToken = Token.LEFT_PAREN;
            }
            case ')' -> {
                nextChar();
                curToken = Token.RIGHT_PAREN;
            }
            default -> {
                StringBuilder tokenStr = new StringBuilder();
                while (!isEnd && Character.isLetter(curChar)) {
                    tokenStr.append(curChar);
                    nextChar();
                }
                curWord = tokenStr.toString();
                if (tokensRepresentation.containsKey(curWord)) {
                    curToken = tokensRepresentation.get(curWord);
                } else {
                    if (curWord.length() == 1 && Character.isLowerCase(curWord.charAt(0))) {
                        curToken = Token.VAR_NAME;
                    } else {
                        throw new ParseException("Illegal characters: " + curWord, curPos);
                    }
                }
            }
        }
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
}
