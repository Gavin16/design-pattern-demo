package patterns.proxy.Dynamic;

import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.Method;

public class JavassistProxyFactory {


    /**
     * 获取动态代理对象
     * @param clazz
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public Proxy getProxy(Class clazz) throws IllegalAccessException, InstantiationException {

        ProxyFactory factory = new ProxyFactory();
        factory.setSuperclass(clazz);

        factory.setFilter(new MethodFilter() {
            public boolean isHandled(Method m) {
                return !m.getName().equals("finalize");
            }
        });

        Class c = factory.createClass();
        Proxy proxy = (Proxy) c.newInstance();
        proxy.setHandler(new MethodHandler() {
            public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
                System.out.println("method name: "+ thisMethod.getName() + " exec");
                return proceed.invoke(self, args);
            }
        });

        return proxy;
    }
}
