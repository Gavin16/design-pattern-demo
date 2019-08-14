package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Class: OnlineShopper
 * @Description:
 *
 * 商品信息更新后，通知到在线浏览着
 *
 * @Author: Minsky
 * @Date: 2019/8/14 16:32
 * @Version: v1.0
 */
public class OnlineShopper implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Integer maintain = (Integer) arg;
        System.out.println("商品当前剩余量：[" + maintain + "]");
    }
}
