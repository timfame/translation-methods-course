package ru.ifmo.generator;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.ifmo.antlr.GrammarLexer;
import ru.ifmo.antlr.GrammarParser;

import java.io.*;

public class Generator {
    public static void main(String[] args) throws GrammarException {
        try (BufferedReader br = new BufferedReader(new FileReader("logicalgram"))) {
            GrammarLexer lexer = new GrammarLexer(CharStreams.fromReader(br));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);
            GrammarWalker walker = new GrammarWalker();
            ParseTreeWalker.DEFAULT.walk(walker, parser.parseAllGrammar());
            LexerGenerator lg = new LexerGenerator(walker);
            ParserGenerator pg = new ParserGenerator(walker);
            try (BufferedWriter bwl = new BufferedWriter(new FileWriter("src/main/java/ru/ifmo/lexer/Lexer.java"));
                BufferedWriter bwp = new BufferedWriter(new FileWriter("src/main/java/ru/ifmo/parser/Parser.java"));
                BufferedWriter bwt = new BufferedWriter(new FileWriter("src/main/java/ru/ifmo/parser/Tree.java"))) {
                bwl.write(lg.generate());
                bwp.write(pg.generate());
                bwt.write(pg.generateTree());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
