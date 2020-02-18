package cn.zhaojishun.javaBase.设计模式.创建型模式.单例模式.静态内部类;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-08 16:42
 */
public class Singleton {

    private static volatile Singleton instance;
    //构造器私有化
    private Singleton() {}
    //写一个静态内部类,该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}