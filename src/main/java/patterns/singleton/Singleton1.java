package patterns.singleton;

/**
 * 单例模式
 *
 * 类型:饿汉模式; 在类加载时创建实例; 线程安全的
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}
