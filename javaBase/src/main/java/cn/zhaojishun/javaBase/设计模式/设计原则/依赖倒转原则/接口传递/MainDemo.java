package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.接口传递;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 10:57
 */
public class MainDemo {
    public static void main(String[] args) {
        KangJia kangJia = new KangJia();
        ITvOpenAndClose iTvOpenAndClose = new OpenAndClose();
        iTvOpenAndClose.open(kangJia);

    }
}