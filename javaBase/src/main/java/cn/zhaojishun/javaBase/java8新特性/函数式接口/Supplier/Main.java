package cn.zhaojishun.javaBase.java8新特性.函数式接口.Supplier;

import java.util.function.Supplier;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 18:50
 */
public class Main {

    //供给型接口 Supplier 没有参数只有返回值
    public static void main(String[] args) {

        /*Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100);
            }
        };*/
        Supplier<Integer> supplier = ()->{return 8;};
        System.out.println(supplier.get());
    }

}