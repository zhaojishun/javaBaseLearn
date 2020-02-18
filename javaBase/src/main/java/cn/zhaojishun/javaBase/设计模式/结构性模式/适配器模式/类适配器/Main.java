package cn.zhaojishun.javaBase.设计模式.结构性模式.适配器模式.类适配器;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-13 10:46
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}