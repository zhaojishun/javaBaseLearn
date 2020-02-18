package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.抽象工厂模式.抽象工厂模式数据访问;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:16
 */
public class Main {
    public static void main(String[] args) {
        User u = new User();

        IFactory iFactory = new MySqlFactory();

        IUser userService = iFactory.createUser();
        userService.insert(u);
        userService.getUser(1);

        Department d = new Department();
        IDepartment departmentService = iFactory.createDepartment();
        departmentService.getdepartment(1);
        departmentService.insert(d);
    }




}