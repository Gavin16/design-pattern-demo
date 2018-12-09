package singleton;

/**
 * 单例模式：懒汉模式
 *
 * --双重检查锁: 线程安全
 *
 */
public class Singleton3 {
    /** 线程安全角度考虑需要 是使用volatile关键字声明 */
    private static volatile Singleton3 instance;

    private Singleton3(){}

    /**
     * 双重检查锁实现可以有效提高效率
     * 因为在大多数时候多处访问getInstance 方法时  是不需要创建实例的
     * 所以外层的null 判断可以大大的减少排队等待时间
     * 而里层的null 判断是用来在实例创建之初给第一次访问者用的
     */
    public static Singleton3 getInstance(){
        if(null == instance){
            synchronized (Singleton3.class){
                if(null == instance){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
