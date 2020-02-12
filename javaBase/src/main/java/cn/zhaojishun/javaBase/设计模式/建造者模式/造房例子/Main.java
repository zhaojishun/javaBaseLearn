package cn.zhaojishun.javaBase.设计模式.建造者模式.造房例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-12 11:24
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director(new BigHouseBuilder());
        System.out.println(director.builderHouse());
        director.setHouseBuilder(new SmailHouseBuilder());
        System.out.println(director.builderHouse());
    }
}