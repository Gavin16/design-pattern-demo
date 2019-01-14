package adapter;

/**
 * @Auther: Minsky
 * @Date: 2019/1/14 23:18
 * @Description:
 */
public class Test {

    public static void main(String[] args){
        Adapter adapter = new Adapter(new Adaptee());
        adapter.method1();
        adapter.method2();
    }
}
