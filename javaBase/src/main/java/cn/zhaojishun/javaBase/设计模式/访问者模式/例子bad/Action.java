package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-21 09:07
 */
public abstract class Action {

    //得到男性的测评结果
    public abstract void getManResult(Man man);

    //得到女行的测评
    public abstract void getWoManResult(WoMan woMan);
}