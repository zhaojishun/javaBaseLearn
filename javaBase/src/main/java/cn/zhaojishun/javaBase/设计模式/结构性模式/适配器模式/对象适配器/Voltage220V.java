package cn.zhaojishun.javaBase.设计模式.结构性模式.适配器模式.对象适配器;

/**
 * @program: javaBaseLearn
 * @description: 需要是适配的类 Adaptee
 * @author: Shunji Zhao
 * @create: 2020-02-13 10:33
 */
public class Voltage220V {
    //输出 220V 的电压
    public int output220V(){
        int src=220;
        return src;
    }

}