package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-21 09:08
 */
public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}