package cn.zhaojishun.javaBase.设计模式.创建型模式.单例模式.懒汉式.线程安全;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-08 16:36
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}