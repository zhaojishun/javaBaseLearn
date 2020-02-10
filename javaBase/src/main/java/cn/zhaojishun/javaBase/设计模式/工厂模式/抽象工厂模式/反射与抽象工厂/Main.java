package cn.zhaojishun.javaBase.设计模式.工厂模式.抽象工厂模式.反射与抽象工厂;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 11:16
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //反射与抽象工厂例子
        User u = new User();

        IUser userService = DataBaseServer.createUser();
        userService.insert(u);
        userService.getUser(1);

        Department d = new Department();
        IDepartment departmentService = DataBaseServer.createDepartment();
        departmentService.getdepartment(1);
        departmentService.insert(d);
    }




}