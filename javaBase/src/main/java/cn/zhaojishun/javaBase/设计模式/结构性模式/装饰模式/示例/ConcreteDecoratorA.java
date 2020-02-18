package cn.zhaojishun.javaBase.设计模式.结构性模式.装饰模式.示例;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 16:09
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void method1(){
        System.out.println("方法1");
    }

    @Override
    public void operation() {
        this.method1();
        super.operation();
    }
}