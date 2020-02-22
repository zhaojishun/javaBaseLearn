package cn.zhaojishun.javaBase.基础.枚举;

import java.util.Arrays;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 18:27
 */
public class Main {

    public static void main(String[] args) {

        Size s = Enum.valueOf(Size.class,"S");
        System.out.println(s);
        System.out.println(s == Size.S);
        System.out.println(Arrays.toString(Size.values()));
    }

}