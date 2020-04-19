package principles.OCP.monitor.rule;

import lombok.Data;

@Data
public class Rule {

    private String url;
    private Long maxTps;

    public Rule(String url){
        this.url = url;
    }
}
