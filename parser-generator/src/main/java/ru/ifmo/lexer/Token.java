package ru.ifmo.lexer;

public class Token {
    public static final Token END = new Token("$END$", "", false);

    private final String name;
    private final String value;
    private final boolean isRegex;

    public Token(String name, String value, boolean isRegex) {
        this.name = name;
        this.value = value;
        this.isRegex = isRegex;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isRegex() {
        return isRegex;
    }
}
