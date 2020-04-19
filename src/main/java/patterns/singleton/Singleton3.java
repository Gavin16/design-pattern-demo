package patterns.singleton;

/**
 * 单例模式：懒汉模式
 *
 * --双重检查锁: 线程安全
 *
 */
public class Singleton3 {
    /**
     *  线程安全角度考虑 是需要使用volatile关键字声明的
     *
     *  volatile关键字有两个作用:
     *      背景：
     *      首先getInstance 方法中的 “instance = new Singleton3()” 语句可以拆分为三个操作（伪代码形式）(原子操作):
     *          操作① : objRef = allocate(Singleton3.class)   // 分配对象所需的存储空间
     *          操作② : invokeConstructor(objRef)             //  初始化objRef 引用的对象
     *          操作③ : instance = objRef                     // 对象引用写入共享变量instance
     *
     *          编译器（尤其JIT编译器）会对该赋值操作实际的原子操作做重排序，排序之后操作执行顺序变成了  ①③②
     *
     *      那么假如现在有两个线程T1,T2 分别调用了getInstance 方法， 若T1执行到了instance=new Singleton3()的操作③时，
     *      如果这时T2线程开始调用并执行到了 外层的 “null == instance” 的判断上了, 那么由于T1线程的操作③将一个未初始化的Singleton3
     *      赋给了instance ,因此这时T2 就会判断instance 已经是初始化的非null对象了,然后实际上 instance 虽然非null, 但是它也未被初始化
     *      这时,T2 线程在调用getInstance 后得到的Singleton3 的实例在调用任何方法时都会报错;
     *
     *      以上是 Singleton3 的instance 共享变量在不使用volatile 修饰时会遇到的问题，
     *      如果使用volatile 关键字修饰，问题就不会出现了，原因是volatile 关键字会禁止被修饰的 instance变量的写操作(也就是上面的操作③)参与该
     *      操作之前的重排序,这样当线程T2 判断null!=instance 时，这个时刻的instance 是一个初始化后的实例就可以有保障了。
     *      这是volatile关键字的一个作用; 另一个作用是防止多处理并发调用时 一个线程更新了instance ,这个更新对其它线程的可见性保障。
     *
     */
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
