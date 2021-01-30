package ru.ifmo.rule;

import java.util.List;

public class Eps extends Out.OutPart {

    private final String action;

    public Eps(String action) {
        this.action = action;
    }

    public final static Eps EPS = new Eps("{}");

    @Override
    public String getName() {
        return "^EPS^";
    }

    @Override
    public List<String> getArgs() {
        return List.of();
    }

    @Override
    public String getAction() {
        return action;
    }
}
