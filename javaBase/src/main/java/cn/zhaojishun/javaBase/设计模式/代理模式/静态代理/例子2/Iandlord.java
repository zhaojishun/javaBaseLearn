package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子2;

/**
 * @program: javaBaseLearn
 * @description: 房东 真实角色
 * @author: Shunji Zhao
 * @create: 2020-02-19 10:36
 */
public class Iandlord implements IHouse {
    @Override
    public void house() {
        System.out.println("房东出租房子");
    }
}