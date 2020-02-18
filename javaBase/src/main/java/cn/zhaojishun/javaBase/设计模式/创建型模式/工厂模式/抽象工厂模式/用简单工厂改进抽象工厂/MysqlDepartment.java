package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.抽象工厂模式.用简单工厂改进抽象工厂;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:32
 */
public class MysqlDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("MySqlDepartment 插入一条");
    }

    @Override
    public Department getdepartment(int id) {
        System.out.println("Mysql获取Department");
        return null;
    }
}