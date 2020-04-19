package patterns.proxy.Dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用CGlib 实现动态代理
 */
public class MethodHandler implements MethodInterceptor {

    private Object proxyTarget;

    public Object getProxyInstance(Object object){
        this.proxyTarget = object;
        return Enhancer.create(proxyTarget.getClass(), proxyTarget.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("get pans and cutting board washed..");
//        Object invoke = method.invoke(proxyTarget, objects);
//        return invoke;
        //
        return methodProxy.invokeSuper(o,objects);

    }
}
