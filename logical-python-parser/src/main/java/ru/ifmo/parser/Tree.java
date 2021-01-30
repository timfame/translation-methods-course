package ru.ifmo.parser;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.model.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static guru.nidi.graphviz.model.Factory.node;

public class Tree {
    private final String node;
    private final List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
        children = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return node.equals(tree.node) && children.size() == tree.children.size() &&
                IntStream.range(0, children.size()).allMatch(i -> children.get(i).equals(tree.children.get(i)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, children);
    }

    public void addChildIfNotNull(Tree child) {
        if (child != null) {
            children.add(child);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    public void addChild(String childName) {
        children.add(new Tree(childName));
    }

    private Node visualizeUnique(String uniqueName) {
        if (children.isEmpty()) {
            return node(uniqueName).with(Label.of(node));
        }
        List<Node> vc = IntStream.range(0, children.size())
                .mapToObj(i -> children.get(i).visualizeUnique(uniqueName + i))
                .collect(Collectors.toList());
        return node(uniqueName).with(Label.of(node)).link(vc);
    }

    public Node visualize() {
        return visualizeUnique(node);
    }
}
