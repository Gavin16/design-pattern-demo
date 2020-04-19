package patterns.proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

public class CourseHandler implements InvocationHandler {

    private Object course;

    // 传入被代理对象,获取代理对象
    public Object getCourseProxy(Object course){
        this.course = course;
        Object o = Proxy.newProxyInstance(course.getClass().getClassLoader(), course.getClass().getInterfaces(), this);
        return o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(!isAbsenceOver8Times()){
            signInBeforeClass();
            return method.invoke(course, args);
        }
        return null;
    }

    private boolean isAbsenceOver8Times(){
        // 取数据计算缺课次数;
        System.out.println("check in for student's record");
        if(new Random().nextBoolean()){
            return false;
        }
        return true;
    }

    private void signInBeforeClass(){
        System.out.println("every student should sign before get sited..");
        // 记录签到数据
    }
}
