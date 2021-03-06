package ru.ifmo.rule;

public class Attribute {
    private final String type;
    private final String name;

    public Attribute(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
