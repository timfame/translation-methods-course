package ru.ifmo;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.ifmo.antlr.CPPLexer;
import ru.ifmo.antlr.CPPParser;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        CPPLexer lexer = new CPPLexer(CharStreams.fromReader(new BufferedReader(new FileReader("ssss.txt"))));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPPParser parser = new CPPParser(tokens);
        System.out.println(parser.global().val.toString());
    }
}
