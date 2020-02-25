package cn.zhaojishun.javaBase.java8新特性.函数式接口.Predicate;

import java.util.function.Predicate;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 18:57
 */
public class Main {

    //断定型接口 有一个输入参数，返回值只能是布尔值！
    public static void main(String[] args) {
        /*Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("a");
            }
        };*/

        Predicate<String> predicate = (s)->{return s.equals("a");};
        System.out.println(predicate.test("b"));
    }

}