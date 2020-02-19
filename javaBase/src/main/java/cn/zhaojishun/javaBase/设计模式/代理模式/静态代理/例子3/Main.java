package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子3;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 11:06
 */
public class Main {
    public static void main(String[] args) {
        UserServiceLogProxy userServiceLogProxy = new UserServiceLogProxy();
        userServiceLogProxy.setUserService(new UserServiceImpl());

        userServiceLogProxy.add();
    }
}