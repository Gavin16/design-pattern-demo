package adapter;

/**
 * @Auther: Minsky
 * @Date: 2019/1/14 21:38
 * @Description:
 *      适配器模式把一个类的接口变换成客户端所期待的另一种接口, 从而使原本因接口不匹配而无法两个类能够在一起工作
 *      适配器模式一般运用于不匹配的两个类都无法或者不方便做修改的场景下.
 *
 *      适配模式一般涉及三个角色: (1) 目标角色 Target  (2)源角色 Adaptee (3) 适配器角色 Adapter
 *      三个角色之间的关系是: 适配器把原接口转换成目标接口; 转化前的状态可能是 源角色中缺少客户端需要使用的方法
 *                         因此定义了一个Target 接口,在Target中定义了该方法, 同时Target中还保留的定义了Adapter的方法
 *                         这样Adapter 在实现Target接口的同时又继承了Adatptee 然后在对外提供方法时如果是 Adatptee有的方法
 *                         则提供Adaptee 自带的，如果 Adaptee 没有改方法, 则提供新实现的该方法
 *
 *      适配器模式分 ：  类的适配器模式  和 对象的适配器模式
 *      类适配器模式：   适配器 Adapter 是通过继承 Adaptee 来实现获得现有的方法;
 *                     注意：这里实现Target接口中包含了Adaptee 已有的方法,因此只需要实现剩下的、Target中有而Adaptee 中没有的方法 ！！
 *
 *      对象适配器模式： 适配器 Adapter 与 Adaptee 是关联关系, 即 Adaptee 作为 Adapter 的一个属性为原有方法提供访问
 *
 *      以下定义的是对象适配器模式
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void method1() {
        adaptee.method1();
    }

    public void method2() {
        System.out.println(this.getClass().getName() + "------" +
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
