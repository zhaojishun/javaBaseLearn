package cn.zhaojishun.javaBase.设计模式.结构性模式.桥接模式.手机例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:28
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new FlodePhone(new XiaoMi());
        phone.call();
    }
}