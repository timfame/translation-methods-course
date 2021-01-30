package ru.ifmo.rule;

import java.util.ArrayList;
import java.util.List;

public class Terminal extends Out.OutPart {
    private final String name;
    private final List<String> args;
    private final String action;

    public Terminal(String name) {
        this.name = name;
        this.args = new ArrayList<>();
        this.action = "";
    }

    public Terminal(String name, List<String> args) {
        this.name = name;
        this.args = args;
        this.action = "";
    }

    public Terminal(String name, String action) {
        this.name = name;
        this.args = new ArrayList<>();
        this.action = action;
    }

    public Terminal(String name, List<String> args, String action) {
        this.name = name;
        this.args = args;
        this.action = action;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getArgs() {
        return args;
    }

    @Override
    public String getAction() {
        return action;
    }
}
