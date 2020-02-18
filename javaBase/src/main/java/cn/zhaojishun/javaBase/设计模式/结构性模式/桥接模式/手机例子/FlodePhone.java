package cn.zhaojishun.javaBase.设计模式.结构性模式.桥接模式.手机例子;

/**
 * @program: javaBaseLearn
 * @description: 折叠手机
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:25
 */
public class FlodePhone extends Phone {

    public FlodePhone(Brands brands) {
        super(brands);
    }

    public void call(){
        super.call();
        System.out.println("折叠手机打电话");
    }
}