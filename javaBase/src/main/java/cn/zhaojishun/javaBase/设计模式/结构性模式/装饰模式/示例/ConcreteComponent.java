package cn.zhaojishun.javaBase.设计模式.结构性模式.装饰模式.示例;

/**
 * @program: javaBaseLearn
 * @description:具体构件，通过继承实现Component抽象类中的抽象方法。是最核心、最原始、最基本的接口或抽象类的实现，我们要装饰的就是它。
 * @author: Shunji Zhao
 * @create: 2020-02-16 16:06
 */
public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}