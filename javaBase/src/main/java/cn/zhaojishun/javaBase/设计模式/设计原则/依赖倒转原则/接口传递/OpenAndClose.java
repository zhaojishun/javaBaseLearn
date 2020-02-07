package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.接口传递;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 10:55
 */
public class OpenAndClose implements ITvOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }

    @Override
    public void close(ITV ev) {

    }
}