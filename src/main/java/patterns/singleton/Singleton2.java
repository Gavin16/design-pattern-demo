package patterns.singleton;

/**
 * 单例模式
 *
 * 类型：懒汉模式; 在被调用获取实例时才创建实例； 线程不安全
 */
public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 instance;

    public static Singleton2 getInstance(){
        if(null == instance){
            instance = new Singleton2();
        }
        return instance;
    }

}
