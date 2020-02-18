package cn.zhaojishun.javaBase.设计模式.结构性模式.外观模式.例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-18 10:18
 */
public class Lamplight {

    private static Lamplight instance = new Lamplight();

    public static Lamplight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Lamplight on ");
    }

    public void off() {
        System.out.println(" Lamplight off ");
    }

    public void dim() {
        System.out.println(" Lamplight dim.. ");

    }
}