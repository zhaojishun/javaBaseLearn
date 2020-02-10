package cn.zhaojishun.javaBase.设计模式.工厂模式.抽象工厂模式.抽象工厂模式数据访问;

public interface IDepartment {

    void insert(Department department);

    Department getdepartment(int id);
}
