package cn.zhaojishun.javaBase.设计模式.适配器模式.类适配器;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-13 10:38
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5v() == 5){
            System.out.println("充电");
        }else {
            System.out.println("电压不准");
        }
    }

}