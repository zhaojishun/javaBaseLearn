package cn.zhaojishun.javaBase.数组与集合.Collection集合;

import cn.zhaojishun.javaBase.扩展.lombok.User;

import java.util.ArrayList;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 11:59
 */
public class ListMain {

    public static void main(String[] args) {

        //List 接口有三个实现类，分别是
        //ArrayList、LinkedList、Vector。他们的区别是：
        //ArrayList：数组实现，查询快，增删慢，轻量级；(线程不安全)；
        //LinkedList：双向链表实现，增删快，查询慢(线程不安全)；
        //Vector：数组实现，重量级(线程安全、使用少)；
        ArrayList list = new ArrayList();
        User u1 = User.builder().name("zhangsan").age(18).build();
        User u2 = User.builder().name("zhangsan").age(13).build();
        User u3 = User.builder().name("zhangsan").age(14).build();
        User u4 = User.builder().name("zhangsan").age(15).build();
        User u5 = User.builder().name("zhangsan").age(18).build();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        //遍历
        //list.forEach((item) -> System.out.println(item));

        //查找数据
        //System.out.println(list.contains(User.builder().name("zhangsan").age(22).build()));
        //返回索引
        System.out.println(list.indexOf(User.builder().name("zhangsan").age(14).build()));
    }

}