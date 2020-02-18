package cn.zhaojishun.javaBase.设计模式.结构性模式.装饰模式.示例;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 16:14
 */
public class Main {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        component = new ConcreteDecoratorA(component);

        component = new ConcreteDecoratorB(component);

        component.operation();
    }
}