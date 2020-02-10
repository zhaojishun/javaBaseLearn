package cn.zhaojishun.javaBase.设计模式.工厂模式.工厂方法模式.计算器;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-09 10:00
 */
public class Main {
    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        System.out.println(operation.calculate(1, 2));
    }
}