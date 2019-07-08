package proxy.Dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

public class CourseMethodHandler implements MethodInterceptor {


    private Object course;

    public Object getCourseProxy(Object course){
        this.course = course;
        return Enhancer.create(course.getClass(), course.getClass().getInterfaces(), this);
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(!isAbsenceOver8Times()){
            signInBeforeClass();
            // 这里原方法的实现可以通过使用第二个参数method 来调用(反射机制)
            // 如果利用反射机制,需要将被代理类作为第一个参数传给method.invoke的第一个参数
            // method.invoke(course,objects)
            // 还可以通过使用methodProxy调用父类方法来实现
            Object invoke = methodProxy.invokeSuper(o, objects);
            return invoke;
        }
        return null;
    }

    private boolean isAbsenceOver8Times(){
        // 取数据计算缺课次数;
        System.out.println("check in for student's record");
        if(new Random().nextBoolean()){
            return false;
        }
        return false;
    }

    private void signInBeforeClass(){
        System.out.println("every student should sign before get sited..");
        // 记录签到数据
    }
}
