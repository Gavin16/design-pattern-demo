package principles.OCP.monitor;

public class MonitorDemo {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();

        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
