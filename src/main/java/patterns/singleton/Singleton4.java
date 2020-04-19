package patterns.singleton;

/**
 * 单例模式：枚举方式实现
 *
 * -- effective java 推荐方式 -- 做到：自由序列化，线程安全，保证单例
 */
public class Singleton4 {

    private Singleton4(){}


    public static Singleton4 getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }

    /**
     *  内部静态枚举
     */
    private enum SingletonEnum{
        /** 这里列举出来的是当前枚举的静态final实例 */
        INSTANCE;

        private Singleton4 singleton4;

        /** 枚举的构造方法; 虚拟机确保只调用一次*/
        SingletonEnum(){
            singleton4 = new Singleton4();
        }

        public Singleton4 getInstance(){
            return singleton4;
        }
    }
}
