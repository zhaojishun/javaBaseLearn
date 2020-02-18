package cn.zhaojishun.javaBase.设计模式.结构性模式.桥接模式.基本代码;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:10
 */
public class Main {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementeor(new ConcreteImplementor1());
        abstraction.operation();

        abstraction.setImplementeor(new ConcreteImplementor2());
        abstraction.operation();
    }
}