package cn.zhaojishun.javaBase.设计模式.结构性模式.桥接模式.手机例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:22
 */
public abstract class Phone {

    private Brands brands;

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public Phone(Brands brands) {
        this.brands = brands;
    }

    protected void call(){
        brands.call();
    }
}