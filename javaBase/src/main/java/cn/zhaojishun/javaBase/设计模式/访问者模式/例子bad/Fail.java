package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-21 09:12
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("该歌手评价失败 男");

    }

    @Override
    public void getWoManResult(WoMan woMan) {
        System.out.println("该歌手评价失败 女");
    }
}