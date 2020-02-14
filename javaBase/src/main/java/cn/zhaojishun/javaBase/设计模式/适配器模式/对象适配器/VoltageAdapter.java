package cn.zhaojishun.javaBase.设计模式.适配器模式.对象适配器;

/**
 * @program: javaBaseLearn
 * @description: Adapter 通过在内部包装一个Adaptee对象，把原接口转换为目标接口
 * @author: Shunji Zhao
 * @create: 2020-02-13 10:37
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5v() {
        if(voltage220V != null){
            return voltage220V.output220V() / 44;
        }else {
            return 0;
        }
    }
}