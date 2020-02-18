package cn.zhaojishun.javaBase.设计模式.结构性模式.适配器模式.类适配器;

/**
 * @program: javaBaseLearn
 * @description: Adapter 通过在内部包装一个Adaptee对象，把原接口转换为目标接口
 * @author: Shunji Zhao
 * @create: 2020-02-13 10:37
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5v() {
        return output220V() / 44;
    }
}