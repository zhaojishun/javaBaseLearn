package cn.zhaojishun.javaBase.设计模式.创建型模式.建造者模式.造房例子;

/**
 * @program: javaBaseLearn
 * @description:建造者（ConcreteBuilder）
 * @author: Shunji Zhao
 * @create: 2020-02-12 11:09
 */
public class SmailHouseBuilder extends HouseBuilder{

    private House house = new House();
    @Override
    public void builderBaise() {
        house.setBaise("2m");
    }

    @Override
    public void builderWall() {
        house.setWall("3m");

    }

    @Override
    public void builderRoofed() {
        house.setRoofed("4m");
    }

    @Override
    public House getProduct() {
        return house;
    }
}