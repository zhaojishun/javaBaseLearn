package cn.zhaojishun.javaBase.设计模式.工厂模式.简单工厂模式.计算器2;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:51
 */
public class DivisionOperation implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}