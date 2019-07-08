package proxy.Dynamic;

import decorator.OtherCourse;
import javassist.util.proxy.Proxy;
import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[]args) throws InstantiationException, IllegalAccessException {
//        CookHandler cookHandler = new CookHandler();
//        Cooker cooker = (Cooker) cookHandler.getProxyInstance(new CookMan());
//        cooker.cut();
//        cooker.flavor();

//        CourseHandler courseHandler = new CourseHandler();
//        Course courseProxy = (Course) courseHandler.getCourseProxy(new OtherCourse());
//        courseProxy.takeClass();

//        MethodHandler methodHandler = new MethodHandler();
//        Cooker cooker1  = (Cooker) methodHandler.getProxyInstance(new CookMan());
//        cooker1.cut();
//        cooker1.flavor();

//        Enhancer.create(OtherCourse.class, )
        CourseMethodHandler courseMethodHandler = new CourseMethodHandler();
        OtherCourse oc = (OtherCourse) courseMethodHandler.getCourseProxy(new OtherCourse());
        oc.takeClass();

        // 使用javassist 实现动态代理
        JavassistProxyFactory proxyFactory = new JavassistProxyFactory();
        Proxy proxy = proxyFactory.getProxy(OtherCourse.class);

    }
}
