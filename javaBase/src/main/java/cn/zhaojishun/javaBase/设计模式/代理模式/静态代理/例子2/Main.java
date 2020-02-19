package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子2;

/**
 * @program: javaBaseLearn
 * @description: 客户端
 * @author: Shunji Zhao
 * @create: 2020-02-19 10:43
 */
public class Main {
    public static void main(String[] args) {

        Intermediary intermediary = new Intermediary(new Iandlord());
        intermediary.house();
    }
}