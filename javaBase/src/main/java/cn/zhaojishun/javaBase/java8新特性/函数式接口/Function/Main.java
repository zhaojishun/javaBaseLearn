package cn.zhaojishun.javaBase.java8新特性.函数式接口.Function;

import java.util.function.Function;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 19:01
 */
public class Main {

    public static void main(String[] args) {
        //
        // Function<String,String> function = new Function<String,String>() {
        // @Override
        // public String apply(String str) {
        // return str;
        // }
        // };
        Function<String,String> function = (str)->{return str+"555";};
        System.out.println(function.apply("asd"));

    }

}