package cn.zhaojishun.javaBase.设计模式.代理模式.动态代理.jdk代理.例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 11:02
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void del() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void query() {
        System.out.println("查找用户");
    }
}