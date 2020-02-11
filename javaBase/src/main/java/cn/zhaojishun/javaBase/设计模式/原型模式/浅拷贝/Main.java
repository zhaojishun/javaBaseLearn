package cn.zhaojishun.javaBase.设计模式.原型模式.浅拷贝;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-11 09:55
 */
public class Main {
    public static void main(String[] args) {
        User u = new User("zhangsan",15);
        User u1 = (User) u.clone();
        User u2 = (User) u.clone();
        User u3 = (User) u.clone();
        User u4 = (User) u.clone();

        System.out.println(u);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
    }
}