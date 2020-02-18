package cn.zhaojishun.javaBase.设计模式.创建型模式.建造者模式.造房例子;

/**
 * @program: javaBaseLearn
 * @description: 抽象建造者>Builder
 * @author: Shunji Zhao
 * @create: 2020-02-12 10:55
 */
public abstract class HouseBuilder {
    //建造流程
    public abstract void builderBaise();
    public abstract void builderWall();
    public abstract void builderRoofed();

    //返回产品
    public abstract House getProduct();

}