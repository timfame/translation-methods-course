package ru.ifmo.rule;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private final String nonTerm;
    private final List<Out> outs = new ArrayList<>();
    private List<Attribute> attrs;
    private Attribute returns;

    public Rule(String nonTerm) {
        this.nonTerm = nonTerm;
    }

    public String getNonTerm() {
        return nonTerm;
    }

    public void addOut(Out out) {
        outs.add(out);
    }

    public List<Out> getOuts() {
        return outs;
    }

    public void setAttrs(List<Attribute> attrs) {
        if (this.attrs == null) {
            this.attrs = attrs;
        }
    }

    public List<Attribute> getAttrs() {
        return attrs;
    }

    public void setReturns(Attribute results) {
        if (this.returns == null) {
            this.returns = results;
        }
    }

    public Attribute getReturns() {
        return returns;
    }

}
