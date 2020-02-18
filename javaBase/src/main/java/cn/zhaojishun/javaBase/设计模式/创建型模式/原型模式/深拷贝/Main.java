package cn.zhaojishun.javaBase.设计模式.创建型模式.原型模式.深拷贝;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-11 10:27
 */
public class Main {

    public static void main(String[] args) {
        IdCard idCard = new IdCard(1,"张三的id卡");
        User u = new User("zhangsan",15,idCard);
        //使用clone方式
        User u2 = (User) u.clone();
        System.out.println(u);
        System.out.println(u2);

        //使用序列化方式
        User u3 = (User) u.deepClone();
        System.out.println(u);
        System.out.println(u3);
    }
}