package ru.ifmo.rule;

import java.util.ArrayList;
import java.util.List;

public class Out {

    private final List<OutPart> parts;

    public Out(List<OutPart> parts) {
        this.parts = parts;
    }

    public List<OutPart> getParts() {
        return parts;
    }

    public abstract static class OutPart {
        public abstract String getName();
        public abstract List<String> getArgs();
        public abstract String getAction();

        @Override
        public String toString() {
            return getName();
        }
    }
}
