package cn.zhaojishun.javaBase.设计模式.工厂模式.简单工厂模式.计算器2;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:52
 */
public class MainDemo {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        String operation = "+";
        Operation o = OperationFactory.createOperation(operation);
        System.out.println(o.calculate(a, b));

    }

}