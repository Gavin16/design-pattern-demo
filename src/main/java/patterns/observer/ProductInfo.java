package patterns.observer;

import java.util.Observable;

/**
 * @Class: ProductInfo
 * @Description:
 *
 *
 *
 * @Author: Minsky
 * @Date: 2019/8/14 16:28
 * @Version: v1.0
 */
public class ProductInfo extends Observable {

    private int stockNum;

    public ProductInfo(int stockNum){
        this.stockNum = stockNum;
    }


    public void decriseStock(int amt){
        this.stockNum -= amt;

        // 减库存之后头通知到观察者
        this.setChanged();
        this.notifyObservers(stockNum);
    }

}
