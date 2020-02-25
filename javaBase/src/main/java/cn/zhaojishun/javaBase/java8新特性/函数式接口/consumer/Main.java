package cn.zhaojishun.javaBase.java8新特性.函数式接口.consumer;

import java.util.function.Consumer;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 18:46
 */
public class Main {

    //Consumer 消费型接口 只有输入没有返回值 Consumer
    public static void main(String[] args) {

       /* Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        };*/

        Consumer<String> consumer = (str)->{System.out.println(str);};
        consumer.accept("ang");


    }

}