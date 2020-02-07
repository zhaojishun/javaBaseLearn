package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.应用示例;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 10:38
 */
public class 依赖倒转 {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new TencentEmail());
        p.receive(new NetEaseEmail());

    }

}