package proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK反射机制实现动态代理
 */
public class CookHandler implements InvocationHandler {
    /** 被代理对象 */
    private Object proxyTarget;

    /** 传入被代理对象,返回代理对象*/
    public Object getProxyInstance(Object obj){
        this.proxyTarget = obj;
        Object proxyer = Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(), proxyTarget.getClass().getInterfaces(), this);
        return proxyer;
    }

    /** 被代理对象执行任意方法时,代理对象会执行invoke方法 */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("get pans and cutting board washed..");
        // 利用反射机制调用被代理对象的方法
        Object invoke = method.invoke(proxyTarget, args);
        return invoke;
    }
}
