package cn.zhaojishun.javaBase.设计模式.桥接模式.手机例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:20
 */
public class XiaoMi implements Brands{
    @Override
    public void call() {
        System.out.println("小米品牌");
    }
}