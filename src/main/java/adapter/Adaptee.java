package adapter;

/**
 * @Auther: Minsky
 * @Date: 2019/1/14 21:39
 * @Description:
 *         源接口, 即适配器需要适配的对象
 */
public class Adaptee {

    public void method1(){

        // 打印当前正在执行的方法名
        System.out.println(this.getClass().getName() + "========" +
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
