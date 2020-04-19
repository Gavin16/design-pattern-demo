package patterns.proxy.Dynamic;

public class CookMan implements Cooker {

    public void cut() {
        System.out.println("cooker cutting the material");
    }

    public void flavor() {
        System.out.println("flavor the food when cooked");
    }
}
