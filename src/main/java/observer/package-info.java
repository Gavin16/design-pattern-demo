package observer;

/**
 * 观察者模式
 *
 *  Java中观察者模式已经有现成的 Observable 和 Observer 接口
 *
 *  被观察这只需要继承 Observable 类 并在关注信息有更新时设置更新 并通知所有观察者即可,这样被观察者可以在update方法中看到更新
 *
 *  观察者需要实现 Observer 接口， 在update 方法中可以查看到被观察者的信息 及 通知方法中的传参
 */