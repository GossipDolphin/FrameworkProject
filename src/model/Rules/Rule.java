package model.Rules;

import java.util.ArrayList;

public class Rule {

    private int ruleNo;
    private String ruleName;
    private String ruleDescription;
    private int rulePriority;

    private ArrayList<Rule> RuleList = new ArrayList<>();


    Rule(RuleBuilder builder) {
        this.ruleNo = builder.ruleNo;
        this.ruleName = builder.ruleName;
        this.ruleDescription = builder.ruleDescription;
        this.rulePriority = builder.rulePriority;

    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public int getRuleNo() {
        return ruleNo;
    }

    public String getRuleName() {
        return ruleName;
    }

    public int getRulePriority() {
        return rulePriority;
    }

    public ArrayList<Rule> getRuleList() {
        return RuleList;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "ruleNo=" + ruleNo +
                ", ruleName='" + ruleName + '\'' +
                ", ruleDescription='" + ruleDescription + '\'' +
                ", rulePriority=" + rulePriority +
                ", RuleList=" + RuleList +
                '}';
    }


}
