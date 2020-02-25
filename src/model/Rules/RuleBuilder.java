package model.Rules;

public class RuleBuilder {

    public int ruleNo;
    public String ruleName;
    public String ruleDescription;
    public int rulePriority;


    /**
     * @param ruleNo Specify the rule number
     * @return
     */
    public RuleBuilder number(int ruleNo) {
        this.ruleNo = ruleNo;
        return this;
    }

    /**
     * @param ruleName Specify the name of the rule
     * @return
     */
    public RuleBuilder name(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * @param rulePriority Specify the priority of the rule ranking from 1-3 where rank 1 will override rank 2 and 3 and so on.
     * @return
     */
    public RuleBuilder priority(int rulePriority) {
        this.rulePriority = rulePriority;
        return this;
    }

    /**
     * @param ruleDescription Specify a rule Description for easier understanding.
     * @return
     */
    public RuleBuilder description(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }


    /**
     * @return Inizialize the build of a rule.
     */
    public Rule build() {
        Rule rule = new Rule(this);
        validateRuleObject(rule);
        return rule;
    }

    /**
     * @param rule Validates the rule object. PS: Needs to be implemented!
     */
    private void validateRuleObject(Rule rule) {

        //will be eventually implemented later on...

    }


}
