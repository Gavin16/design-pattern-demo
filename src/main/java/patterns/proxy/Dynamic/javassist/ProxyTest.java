package patterns.proxy.Dynamic.javassist;

public class ProxyTest {

    public static void main(String[] args) throws Throwable {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IHello hello = new Hello();
        CustomHandler customHandler = new CustomHandler(hello);
        IHello helloProxy = (IHello) ProxyFactory.newProxyInstance(hello.getClass().getClassLoader(), IHello.class, customHandler);
        helloProxy.sayHello("zhsan");
    }

}