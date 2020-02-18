package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.工厂方法模式.计算器;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:47
 */
public class AddOperation implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}