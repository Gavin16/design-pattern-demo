package principles.OCP.monitor.handlers;

import principles.OCP.monitor.rule.AlertRule;
import principles.OCP.monitor.ApiStatInfo;
import principles.OCP.monitor.notification.Notification;
import principles.OCP.monitor.notification.NotificationEmergencyLevel;

public class TpsAlertHandler extends AlertHandler {


    public TpsAlertHandler(AlertRule rule, Notification notification){
        super(rule,notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount()/ apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }

}
