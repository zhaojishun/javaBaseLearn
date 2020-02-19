package cn.zhaojishun.javaBase.设计模式.代理模式.动态代理.jdk代理.例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 11:06
 */
public class Main {
    public static void main(String[] args) {

        //真实对象
        UserService userService = new UserServiceImpl();

        //代理角色由代理类生成
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理目标
        pih.setTarget(userService);
        //获得生成的代理对象
        UserService proxyInstance = (UserService) pih.getProxyInstance();

        //使用代理对象
        proxyInstance.add();


    }
}