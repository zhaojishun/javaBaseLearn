package cn.zhaojishun.javaBase.设计模式.建造者模式.造房例子;

/**
 * @program: javaBaseLearn
 * @description: 指挥者&导演者 Director
 * @author: Shunji Zhao
 * @create: 2020-02-12 11:18
 */
public class Director {

    private HouseBuilder houseBuilder;

    public House builderHouse(){
        houseBuilder.builderBaise();
        houseBuilder.builderRoofed();
        houseBuilder.builderWall();
        return houseBuilder.getProduct();
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}