package cn.zhaojishun.javaBase.设计模式.工厂模式.抽象工厂模式.抽象工厂模式数据访问;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:11
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("sqlserver 插入用户");
    }

    @Override
    public User getUser(int id) {
        System.out.println("sqlserver 获取用户");
        return null;
    }
}