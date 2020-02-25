package model;

import java.util.ArrayList;

public class RuleBuilder {

    public int ruleNo;
    public String ruleName;
    public String ruleDescription;
    public int rulePriority;


    public ArrayList<Player> ApplyRuletoPlayerList = new ArrayList<>();

    public int getRuleNo() {
        return ruleNo;
    }

    public String getRuleName() {
        return ruleName;
    }

    public int getRulePriority() {
        return rulePriority;
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public ArrayList<Player> getApplyRuletoPlayerList() {
        return ApplyRuletoPlayerList;
    }


    public RuleBuilder RuleNumber(int ruleNo){
        this.ruleNo =ruleNo;
        return this;
    }

    public RuleBuilder Name(String ruleName){
        this.ruleName = ruleName;
        return this;
    }
    public RuleBuilder Priority(int rulePriority){
        this.rulePriority = rulePriority;
        return this;
    }

    public RuleBuilder Description(String ruleDescription){
        this.ruleDescription = ruleDescription;
        return this;
    }

    public Rule build(){
        Rule rule = new Rule(this);
        validateRuleObject(rule);
        return rule;
    }

    private void validateRuleObject(Rule rule){

        //will be eventually implemented later on...

    }


}
