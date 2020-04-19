package principles.OCP.monitor.notification;

import principles.OCP.monitor.notification.NotificationEmergencyLevel;

public class Notification {

    public void notify(NotificationEmergencyLevel level, String msg){
        System.out.println("send msg to admin" + " level :" + level + "msg:" + msg);
    }
}
