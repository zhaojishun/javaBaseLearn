package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-21 09:10
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);

}