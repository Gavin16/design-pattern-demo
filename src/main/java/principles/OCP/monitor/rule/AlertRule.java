package principles.OCP.monitor.rule;

import principles.OCP.monitor.rule.Rule;

public class AlertRule {

    public Rule getMatchedRule(String url){
        return new Rule(url);
    }
}
