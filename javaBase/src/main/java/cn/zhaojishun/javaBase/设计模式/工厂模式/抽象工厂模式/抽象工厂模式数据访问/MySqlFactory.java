package cn.zhaojishun.javaBase.设计模式.工厂模式.抽象工厂模式.抽象工厂模式数据访问;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:14
 */
public class MySqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}