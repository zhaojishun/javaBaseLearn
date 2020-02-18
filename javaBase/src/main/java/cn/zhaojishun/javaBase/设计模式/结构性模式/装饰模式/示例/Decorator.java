package cn.zhaojishun.javaBase.设计模式.结构性模式.装饰模式.示例;

/**
 * @program: javaBaseLearn
 * @description:Decorator装饰类
 * @author: Shunji Zhao
 * @create: 2020-02-16 16:07
 */
public abstract class Decorator extends Component {

    //一般是一个抽象类，在其属性里必然有一个private变量指向Component抽象构件。
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}