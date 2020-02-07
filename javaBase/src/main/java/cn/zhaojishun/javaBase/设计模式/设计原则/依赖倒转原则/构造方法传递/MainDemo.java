package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递;

import cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递.ITvOpenAndClose;
import cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递.KangJia;
import cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递.OpenAndClose;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 10:57
 */
public class MainDemo {
    public static void main(String[] args) {
        KangJia kangJia = new KangJia();
        ITvOpenAndClose iTvOpenAndClose = new OpenAndClose(kangJia);
        iTvOpenAndClose.open();

    }
}