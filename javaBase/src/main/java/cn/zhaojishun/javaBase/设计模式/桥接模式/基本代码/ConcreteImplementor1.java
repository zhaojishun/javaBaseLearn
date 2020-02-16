package cn.zhaojishun.javaBase.设计模式.桥接模式.基本代码;

/**
 * @program: javaBaseLearn
 * @description:ConcreteImplementor：具体实现类
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:05
 */
public class ConcreteImplementor1 extends Implementeor{
    @Override
    public void operation() {
        System.out.println("实现类一");
    }
}