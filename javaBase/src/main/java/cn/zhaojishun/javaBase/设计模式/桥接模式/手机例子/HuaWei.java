package cn.zhaojishun.javaBase.设计模式.桥接模式.手机例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:21
 */
public class HuaWei implements Brands {
    @Override
    public void call() {
        System.out.println("华为品牌");
    }
}