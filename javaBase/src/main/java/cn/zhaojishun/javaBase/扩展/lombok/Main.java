package cn.zhaojishun.javaBase.扩展.lombok;

import lombok.extern.log4j.Log4j;

/**
 * @program: javaBaseLearn
 * @description: lombok 例子
 * @author: Jishun Zhao
 * @create: 2020-02-21 20:05
 */
public class Main {

    public static void main(String[] args) {
        // 字段 @NonNull 测试
       /* User user = new User();
        user.setName(null); // NullPointerException
        System.out.println(user);*/

        // 参数@NonNull 测试
       /* User user1 = new User();
        user1.testNonNull(null);//NullPointerException*/

       //@Builder 测试
        /*User fate = User.builder().name("Fate").age(18).build();
        System.out.println(fate.toString());*/


    }

}