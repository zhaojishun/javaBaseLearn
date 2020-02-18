package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.抽象工厂模式.用简单工厂改进抽象工厂;

public interface IDepartment {

    void insert(Department department);

    Department getdepartment(int id);
}
