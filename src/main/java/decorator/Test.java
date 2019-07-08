package decorator;

public class Test {
    public static void main(String[]args){
    // 装饰者模式，客户端需要同时获取到装饰对象和装饰者对象
//    Course course = new StrictClass(new OtherCourse());
//    course.takeClass();
    // 静态代理模式, 客户端感知不到被代理对象的存在
    Course course1 = new StrictClass();
    course1.takeClass();
    }
}
