package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.setter方式传递;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 11:20
 */
public class Main {
    public static void main(String[] args) {
        HTC htc = new HTC();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(htc);
        openAndClose.open();
    }
}