package cn.zhaojishun.javaBase.数组与集合.数组;

import cn.zhaojishun.javaBase.扩展.lombok.User;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 11:38
 */
public class Main {

    public static void main(String[] args) {
       /* User[] user = new User[5];
        for (int i = 0; i < 5; i++) {
            user[i] = User.builder().name("zhangsan"+i).age(15).build();
        }

        User[] user2 = new User[5];
        for (int i = 0; i < 5; i++) {
            user2[i] = User.builder().name("zhangsan").age(15).build();
        }*/
        //数组的比较
        //System.out.println(Arrays.equals(user, user2));

        // 数组的排序
        User[] user5 = new User[5];
        user5[0] = User.builder().name("zhangsan").age(15).build();
        user5[1] = User.builder().name("zhangsan").age(12).build();
        user5[2] = User.builder().name("zhangsan").age(20).build();
        user5[3] = User.builder().name("zhangsan").age(18).build();
        user5[4] = User.builder().name("zhangsan").age(17).build();

        /*System.out.println("排序前");

        for (int i = 0; i < user5.length; i++) {
            System.out.println(user5[i].getAge());
        }

        Arrays.sort(user5, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() < o2.getAge()?-1:1;
            }
        });
        System.out.println("排序后");*/

        for (int i = 0; i < user5.length; i++) {
            System.out.println(user5[i].getAge());
        }
        

    }

}