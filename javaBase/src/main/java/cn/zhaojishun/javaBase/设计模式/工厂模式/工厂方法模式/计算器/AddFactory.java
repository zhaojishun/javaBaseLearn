package cn.zhaojishun.javaBase.设计模式.工厂模式.工厂方法模式.计算器;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-09 09:56
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}