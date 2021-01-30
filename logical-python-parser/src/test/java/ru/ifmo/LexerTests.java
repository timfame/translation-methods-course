package ru.ifmo;

import org.junit.Assert;
import org.junit.Test;
import ru.ifmo.lexer.Lexer;
import ru.ifmo.lexer.Token;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class LexerTests {

    private static final int ITERATIONS = 1000;
    private static final int TEST_TOKENS_COUNT = 1000;

    private static final List<String> tokensRepresentation = List.of("and", "or", "xor", "not", "(", ")", "var_name");
    private static final List<Token> tokens = List.of(
            Token.AND, Token.OR, Token.XOR, Token.NOT,
            Token.LEFT_PAREN, Token.RIGHT_PAREN, Token.VAR_NAME);

    @Test
    public void simpleExpression() {
        String input = "a and b or c xor not d";
        try {
            Lexer lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));
            lexer.nextToken();
            Assert.assertEquals(Token.VAR_NAME, lexer.curToken());
            Assert.assertEquals("a", lexer.curWord());
            lexer.nextToken();
            Assert.assertEquals(Token.AND, lexer.curToken());
            lexer.nextToken();
            Assert.assertEquals(Token.VAR_NAME, lexer.curToken());
            Assert.assertEquals("b", lexer.curWord());
            lexer.nextToken();
            Assert.assertEquals(Token.OR, lexer.curToken());
            lexer.nextToken();
            Assert.assertEquals(Token.VAR_NAME, lexer.curToken());
            Assert.assertEquals("c", lexer.curWord());
            lexer.nextToken();
            Assert.assertEquals(Token.XOR, lexer.curToken());
            lexer.nextToken();
            Assert.assertEquals(Token.NOT, lexer.curToken());
            lexer.nextToken();
            Assert.assertEquals(Token.VAR_NAME, lexer.curToken());
            Assert.assertEquals("d", lexer.curWord());
        } catch (ParseException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void wrongInput() {
        String input = "a and bB orr c xor not d";
        Lexer lexer;
        try {
            lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));
            lexer.nextToken();
            lexer.nextToken();
            lexer.nextToken();
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal characters: bB"));
        }
        input = "aa";
        try {
            lexer = new Lexer(new ByteArrayInputStream(input.getBytes()));
            lexer.nextToken();
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal characters: aa"));
        }
    }

    @Test
    public void randomTests() {
        Random rng = new Random(System.currentTimeMillis());
        try {
            for (int iteration = 0; iteration < ITERATIONS; ++iteration) {
                GeneratedTest gt = generate(rng);
                Lexer lexer = new Lexer(new ByteArrayInputStream(gt.input.getBytes()));
                int i = 0;
                do {
                    lexer.nextToken();
                    Assert.assertEquals(gt.realTokens.get(i), lexer.curToken());
                    i++;
                } while (lexer.curToken() != Token.END);
                Assert.assertEquals(gt.realTokens.size(), i);
            }
        } catch (ParseException e) {
            Assert.fail(e.getMessage());
        }

    }

    private static class GeneratedTest {
        String input;
        List<Token> realTokens;

        public GeneratedTest(String input, List<Token> realTokens) {
            this.input = input;
            this.realTokens = realTokens;
        }
    }

    private GeneratedTest generate(Random rng) {
        StringBuilder resInput = new StringBuilder(getRandomWhitespaces(rng, 0));
        List<Token> resTokens = new ArrayList<>();
        for (int i = 0; i < rng.nextInt(TEST_TOKENS_COUNT) + 10; i++) {
            int tokenIndex = rng.nextInt(tokens.size());
            String token = tokensRepresentation.get(tokenIndex);
            Token realToken = tokens.get(tokenIndex);
            if (realToken == Token.VAR_NAME) {
                token = String.valueOf(Character.toChars(97 + rng.nextInt(26)));
            }

            resInput.append(token);
            resTokens.add(realToken);

            int minimal = 1;
            if (realToken == Token.LEFT_PAREN || realToken == Token.RIGHT_PAREN) {
                minimal = 0;
            }
            resInput.append(getRandomWhitespaces(rng, minimal));
        }
        resTokens.add(Token.END);
        return new GeneratedTest(resInput.toString(), resTokens);
    }

    private static final List<Character> whiteSpaces = List.of('\n', '\t', ' ');

    private String getRandomWhitespaces(Random rng, int minimal) {
        StringBuilder ws = new StringBuilder();
        for (int i = 0; i < rng.nextInt(5) + minimal; i++) {
            ws.append(whiteSpaces.get(rng.nextInt(whiteSpaces.size())));
        }
        return ws.toString();
    }
}
