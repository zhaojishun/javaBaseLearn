package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-21 09:10
 */
public class WoMan extends Person{

    @Override
    public void accept(Action action) {
        action.getWoManResult(this);
    }
}