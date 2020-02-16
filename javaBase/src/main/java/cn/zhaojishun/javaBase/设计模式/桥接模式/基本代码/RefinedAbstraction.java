package cn.zhaojishun.javaBase.设计模式.桥接模式.基本代码;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:09
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation(){
        implementeor.operation();
    }

}