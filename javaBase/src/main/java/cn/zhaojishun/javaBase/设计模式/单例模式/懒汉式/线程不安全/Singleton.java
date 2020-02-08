package cn.zhaojishun.javaBase.设计模式.单例模式.懒汉式.线程不安全;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-08 16:18
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}