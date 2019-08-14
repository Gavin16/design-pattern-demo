package observer;

/**
 * @Class: Test
 * @Description: TODO
 * @Author: Minsky
 * @Date: 2019/8/14 16:39
 * @Version: v1.0
 */
public class Test {


    public static void main(String[]args){
        // 创建产品信息 及 观察者
        ProductInfo product = new ProductInfo(100);
        OnlineShopper shopper = new OnlineShopper();
        product.addObserver(shopper);

        // 修改被观察者(产品信息)
        product.decriseStock(3);

    }
}
