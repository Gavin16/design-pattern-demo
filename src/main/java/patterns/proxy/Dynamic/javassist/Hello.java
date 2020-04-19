package patterns.proxy.Dynamic.javassist;

public class Hello implements IHello {

    public void sayHello(String toWho) {
        System.out.println("hello, " + toWho);
    }
}