package cn.zhaojishun.javaBase.设计模式.装饰模式.示例2;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-17 10:25
 */
public class Main {

    public static void main(String[] args) {
        Component c = new ConcreteDecorator2(new ConcreteDecorator(new ConcreteComponent()));
        c.operation();
    }

}

//Component 组件
interface Component{
    void operation();
}

// 具体的组件
class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("拍照");
    }
}

//装饰
abstract class Decorator implements Component{

    Component component;

    public Decorator(Component component){
        this.component = component;
    }
}
//具体的装饰
class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        System.out.println("美颜");
        component.operation();
    }
}

//具体的装饰
class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        System.out.println("滤镜");
        component.operation();
    }
}

