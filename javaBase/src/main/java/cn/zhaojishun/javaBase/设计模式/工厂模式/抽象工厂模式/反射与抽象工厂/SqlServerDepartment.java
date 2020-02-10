package cn.zhaojishun.javaBase.设计模式.工厂模式.抽象工厂模式.反射与抽象工厂;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:34
 */
public class SqlServerDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("SqlServerDepartment 插入一条");
    }

    @Override
    public Department getdepartment(int id) {
        System.out.println("SqlServer获取Department");
        return null;
    }

}