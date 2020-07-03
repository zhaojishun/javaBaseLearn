package cn.zhaojishun.javaBase.java8新特性.方法引用;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-25 10:18
 */
public class Main {

    public static void main(String[] args) {

        //是一种lambda的另一种表现形式

        //方法引用，若lambda体方法已经实现了，可以使用方法引用
        /*
        * 三种格式
        * 对象::实例方法名
        * 类::静态方法名
        * 类::实例方法名
        *
        * 注意：lambda体中的参数即返回值类型要与函数是接口中的相同
        *
        * **/

        //对象::实例方法名
        //消费性接口
        Consumer<String> consumer = (a)->System.out.println(a);
        Consumer<String> consumer1 = System.out::println;

        //供给型接口
        User u = new User();
        Supplier<String> stringSupplier = () -> u.getName();
        Supplier<String> stringSupplier1 = u::getName;

        //类::静态方法名
        //
        Comparator<Integer> comparator = (x , y) -> Integer.compare(x,y);
        Comparator<Integer> comparator2 = Integer::compare;

        //类::实例方法名
        //第一个参数是实例方法的调用者，第二个参数是实例方法的参数时，可是使用类::实例方法名
        BiPredicate<String,String> bp = (x,y) ->x.equals(y);
        BiPredicate<String,String> bp2 = String::equals;



        /*
        * 构造器引用
        * 要调用的构造器的参数列表要与函数是接口中的方法的参数列表保持一致
        * **/
        Supplier<User> supplier = ()-> new User();
        //无参构造器
        Supplier<User> supplier2 = User::new;

        Function<String,User> function = (c)-> new User(c);
        Function<String,User> function1 = User::new;

        //数组引用
        Function<Integer,String[]> function2 = String[]::new;

    }

}
