package ru.ifmo.rule;

import java.util.List;

public class End extends Out.OutPart {

    public final static End END = new End();

    @Override
    public String getName() {
        return "$END$";
    }

    @Override
    public List<String> getArgs() {
        return List.of();
    }

    @Override
    public String getAction() {
        return "{}";
    }
}
