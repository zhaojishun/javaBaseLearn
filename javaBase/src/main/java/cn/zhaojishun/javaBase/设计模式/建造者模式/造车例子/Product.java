package cn.zhaojishun.javaBase.设计模式.建造者模式.造车例子;

/**
 * @program: javaBaseLearn
 * @description: 产品> Product
 * @author: Shunji Zhao
 * @create: 2020-02-12 10:48
 */
public class Product {
    private String name;
    private String type;
    public void showProduct(){
        System.out.println("名称："+name);
        System.out.println("型号："+type);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
}
abstract class Builder {
    public abstract void setPart(String arg1, String arg2);
    public abstract Product getProduct();
}
class ConcreteBuilder extends Builder {
    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }
}
class Director {
    private Builder builder = new ConcreteBuilder();
    public Product getAProduct(){
        builder.setPart("宝马汽车","X7");
        return builder.getProduct();
    }
    public Product getBProduct(){
        builder.setPart("奥迪汽车","Q5");
        return builder.getProduct();
    }
}
class Client {
    public static void main(String[] args){
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}