package cn.zhaojishun.javaBase.java8新特性.方法引用;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-25 10:18
 */
public class Main {
    //构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
    final Car car = Car.create( Car::new );
    final List< Car > cars = Arrays.asList( car );

    //静态方法引用：它的语法是Class::static_method，实例如下：

    //特定类的任意对象的方法引用：它的语法是Class::method实例如下：

    //特定对象的方法引用：它的语法是instance::method实例如下：

}

class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}