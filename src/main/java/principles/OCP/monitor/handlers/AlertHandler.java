package principles.OCP.monitor.handlers;

import principles.OCP.monitor.rule.AlertRule;
import principles.OCP.monitor.ApiStatInfo;
import principles.OCP.monitor.notification.Notification;

public abstract class AlertHandler {

    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule; this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
