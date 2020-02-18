package cn.zhaojishun.javaBase.设计模式.结构性模式.装饰模式.示例;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 16:13
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void method2(){
        System.out.println("方法2");
    }

    @Override
    public void operation() {
        super.operation();
        this.method2();
    }
}