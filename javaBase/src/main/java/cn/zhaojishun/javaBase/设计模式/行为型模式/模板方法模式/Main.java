package cn.zhaojishun.javaBase.设计模式.行为型模式.模板方法模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 10:12
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();

        concreteClass.templateMethod();
    }
}