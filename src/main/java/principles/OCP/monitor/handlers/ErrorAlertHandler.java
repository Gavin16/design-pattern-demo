package principles.OCP.monitor.handlers;

import principles.OCP.monitor.rule.AlertRule;
import principles.OCP.monitor.ApiStatInfo;
import principles.OCP.monitor.notification.Notification;

public class ErrorAlertHandler extends AlertHandler{

    public ErrorAlertHandler(AlertRule rule, Notification notification){
        super(rule,notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {

    }
}
