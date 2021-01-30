package ru.ifmo;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import ru.ifmo.parser.Parser;
import ru.ifmo.parser.Tree;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import static guru.nidi.graphviz.model.Factory.graph;

public class Main {

    public static void main(String[] args) throws IOException {
        String input = "a xor b or c";
//        String input = "not ( not b xor not a )";
//        String input = "()";
        try {
            Parser parser = new Parser(input);
            Tree tree = parser.parse();
            Graph g = graph("Parse tree").directed()
                    .linkAttr().with("class", "link-class")
                    .with(tree.visualize());
            Graphviz.fromGraph(g).height(1000).render(Format.PNG).toFile(new File("parse_tree.png"));
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}
