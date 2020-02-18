package cn.zhaojishun.javaBase.设计模式.创建型模式.单例模式.饿汉式;


/**
 * @program: javaBaseLearn
 * @description: 单例模式饿汉式
 * @author: Shunji Zhao
 * @create: 2020-02-08 16:05
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return SINGLETON;
    }

}