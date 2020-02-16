package cn.zhaojishun.javaBase.设计模式.桥接模式.手机例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:26
 */
public class SlidePhone extends Phone {
    public SlidePhone(Brands brands) {
        super(brands);
    }

    public void call(){
        super.call();
        System.out.println("滑盖手机打电话");
    }
}