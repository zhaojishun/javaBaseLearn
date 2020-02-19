package cn.zhaojishun.javaBase.设计模式.代理模式.动态代理.cglib代理;

import cn.zhaojishun.javaBase.设计模式.创建型模式.原型模式.浅拷贝.User;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 11:02
 */
public class UserServiceImpl {

    public void add() {
        System.out.println("添加用户");
    }

    public void del() {
        System.out.println("删除用户");
    }

    public void update() {
        System.out.println("更新用户");
    }

    public User query() {
        System.out.println("查找用户");
        return new User("zhnags",180);
    }
}