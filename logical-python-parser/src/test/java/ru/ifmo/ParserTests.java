package ru.ifmo;

import org.junit.Assert;
import org.junit.Test;
import ru.ifmo.parser.Parser;
import ru.ifmo.parser.Tree;

import java.text.ParseException;

public class ParserTests {

    private static final String D = "D [or]";
    private static final String DP = "D' [or tail]";
    private static final String X = "X [xor]";
    private static final String XP = "X' [xor tail]";
    private static final String C = "C [and]";
    private static final String CP = "C' [and tail]";
    private static final String N = "N";
    private static final String V = "V";


    @Test
    public void simpleExpression() {
        String input = "a xor not b";
        Tree expected = new Tree(D, new Tree(X,
                new Tree(C, new Tree(N, new Tree(V, new Tree("\"a\"")))),
                new Tree(XP,
                        new Tree("XOR"),
                        new Tree(C, new Tree(N,
                                new Tree("NOT"),
                                new Tree(N, new Tree(V, new Tree("\"b\""))))))));
        try {
            Parser parser = new Parser(input);
            Tree result = parser.parse();
            Assert.assertEquals(expected, result);
        } catch (ParseException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parenthesesExpression() {
        String input = "(a xor (not b) and z)";
        Tree expected = new Tree(D, new Tree(X, new Tree(C, new Tree(N, new Tree(V,
                new Tree("("),
                new Tree(D, new Tree(X,
                        new Tree(C, new Tree(N, new Tree(V, new Tree("\"a\"")))),
                        new Tree(XP,
                                new Tree("XOR"),
                                new Tree(C,
                                        new Tree(N, new Tree(V,
                                                new Tree("("),
                                                new Tree(D, new Tree(X, new Tree(C, new Tree(N,
                                                        new Tree("NOT"),
                                                        new Tree(N, new Tree(V, new Tree("\"b\""))))))),
                                                new Tree(")"))),
                                        new Tree(CP,
                                                new Tree("AND"),
                                                new Tree(N, new Tree(V, new Tree("\"z\"")))))))),
                new Tree(")"))))));
        try {
            Parser parser = new Parser(input);
            Tree result = parser.parse();
            Assert.assertEquals(expected, result);
        } catch (ParseException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void wrongExpressions() {
        Assert.assertThrows(ParseException.class, () -> runParser("a a"));
        Assert.assertThrows(ParseException.class, () -> runParser("a (a and b)"));
        Assert.assertThrows(ParseException.class, () -> runParser("a not b"));
        Assert.assertThrows(ParseException.class, () -> runParser("a not b)"));
        Assert.assertThrows(ParseException.class, () -> runParser("(a not "));
        Assert.assertThrows(ParseException.class, () -> runParser("()"));
        Assert.assertThrows(ParseException.class, () -> runParser("a or (a and b) (w xor e)"));
        Assert.assertThrows(ParseException.class, () -> runParser("a or (a and b) w xor e"));
        Assert.assertThrows(ParseException.class, () -> runParser("a or (a and b) not e"));
        Assert.assertThrows(ParseException.class, () -> runParser("a xor xor b"));
        Assert.assertThrows(ParseException.class, () -> runParser("a or and z"));
        Assert.assertThrows(ParseException.class, () -> runParser("a not or b"));
        Assert.assertThrows(ParseException.class, () -> runParser("a not (or b)"));
        Assert.assertThrows(ParseException.class, () -> runParser("a ((not w) and z"));
        Assert.assertThrows(ParseException.class, () -> runParser("and a or b"));
        Assert.assertThrows(ParseException.class, () -> runParser("or a or b"));
        Assert.assertThrows(ParseException.class, () -> runParser("a or) b"));
        Assert.assertThrows(ParseException.class, () -> runParser("(a or) b"));
        Assert.assertThrows(ParseException.class, () -> runParser("a (or) b"));
        Assert.assertThrows(ParseException.class, () -> runParser("a or"));
    }

    private void runParser(String input) throws ParseException {
        Parser parser = new Parser(input);
        parser.parse();
    }
}
