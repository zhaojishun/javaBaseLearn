package cn.zhaojishun.javaBase.设计模式.代理模式.动态代理.cglib代理;

import cn.zhaojishun.javaBase.设计模式.创建型模式.原型模式.浅拷贝.User;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 13:50
 */
public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(userService);

        UserServiceImpl userService1= (UserServiceImpl) proxyFactory.getProxyInstance();

        User query = userService1.query();
        System.out.println(query);
    }
}