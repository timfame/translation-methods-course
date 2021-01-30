package ru.ifmo.parser;

import ru.ifmo.lexer.Lexer;
import ru.ifmo.lexer.Token;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Parser {
    private final Lexer lexer;

    public Parser(InputStream input) throws ParseException {
        lexer = new Lexer(input);
    }

    public Parser(String input) throws ParseException {
        lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));
    }

    public Tree parse() throws ParseException {
        lexer.nextToken();
        Tree result = D();
        if (lexer.curToken() != Token.END) {
            currentError(Token.END);
        }
        return result;
    }

    private void currentError(Token... expected) throws ParseException {
        throw new ParseException(
                "Unexpected token: expected [" +
                        Arrays.stream(expected).map(Token::toString).collect(Collectors.joining("|")) +
                        "], actual " + lexer.curToken().toString(),
                lexer.curPos());
    }

    private Tree D() throws ParseException {
        Tree result = new Tree("D [or]");
        switch (lexer.curToken()) {
            case LEFT_PAREN, VAR_NAME, NOT -> {
                result.addChildIfNotNull(C());
                result.addChildIfNotNull(DP());
            }
            default -> currentError(Token.LEFT_PAREN, Token.VAR_NAME, Token.NOT);
        }
        return result;
    }

    private Tree DP() throws ParseException {
        Tree result = null;
        switch (lexer.curToken()) {
            case OR  -> {
                result = new Tree("D' [or|and tail]");
                result.addChild("OR");
                lexer.nextToken();
                result.addChildIfNotNull(C());
                result.addChildIfNotNull(DP());
            }
            case XOR  -> {
                result = new Tree("D' [or|xor tail]");
                result.addChild("XOR");
                lexer.nextToken();
                result.addChildIfNotNull(C());
                result.addChildIfNotNull(DP());
            }
            case RIGHT_PAREN, END -> {}
            default -> currentError(Token.OR, Token.RIGHT_PAREN, Token.END);
        }
        return result;
    }

    private Tree C() throws ParseException {
        Tree result = new Tree("C [and]");
        switch (lexer.curToken()) {
            case LEFT_PAREN, VAR_NAME, NOT -> {
                result.addChildIfNotNull(N());
                result.addChildIfNotNull(CP());
            }
            default -> currentError(Token.LEFT_PAREN, Token.VAR_NAME, Token.NOT);
        }
        return result;
    }

    private Tree CP() throws ParseException {
        Tree result = null;
        switch (lexer.curToken()) {
            case AND  -> {
                result = new Tree("C' [and tail]");
                result.addChild("AND");
                lexer.nextToken();
                result.addChildIfNotNull(N());
                result.addChildIfNotNull(CP());
            }
            case XOR, OR, RIGHT_PAREN, END -> {}
            default -> currentError(Token.AND, Token.XOR, Token.OR, Token.RIGHT_PAREN, Token.END);
        }
        return result;
    }

    private Tree N() throws ParseException {
        Tree result = new Tree("N");
        switch (lexer.curToken()) {
            case LEFT_PAREN, VAR_NAME -> result.addChildIfNotNull(V());
            case NOT -> {
                result.addChild("NOT");
                lexer.nextToken();
                result.addChildIfNotNull(N());
            }
            default -> currentError(Token.LEFT_PAREN, Token.VAR_NAME, Token.NOT);
        }
        return result;
    }

    private Tree V() throws ParseException {
        Tree result = new Tree("V");
        switch (lexer.curToken()) {
            case LEFT_PAREN -> {
                lexer.nextToken();
                result.addChild("(");
                result.addChildIfNotNull(D());
                if (lexer.curToken() != Token.RIGHT_PAREN) {
                    currentError(Token.RIGHT_PAREN);
                }
                result.addChild(")");
                lexer.nextToken();
            }
            case VAR_NAME -> {
                result.addChildIfNotNull(new Tree("\"" + lexer.curWord() + "\""));
                lexer.nextToken();
            }
            default -> currentError(Token.LEFT_PAREN, Token.VAR_NAME);
        }
        return result;
    }

}
