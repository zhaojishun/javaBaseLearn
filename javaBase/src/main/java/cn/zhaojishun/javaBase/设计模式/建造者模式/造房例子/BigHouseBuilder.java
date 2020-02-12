package cn.zhaojishun.javaBase.设计模式.建造者模式.造房例子;

/**
 * @program: javaBaseLearn
 * @description:建造者（ConcreteBuilder）
 * @author: Shunji Zhao
 * @create: 2020-02-12 11:06
 */
public class BigHouseBuilder extends HouseBuilder {

    private House house = new House();
    @Override
    public void builderBaise() {
        house.setBaise("20m");
    }

    @Override
    public void builderWall() {
        house.setWall("30m");

    }

    @Override
    public void builderRoofed() {
        house.setRoofed("40m");
    }



    @Override
    public House getProduct() {
        return house;
    }
}