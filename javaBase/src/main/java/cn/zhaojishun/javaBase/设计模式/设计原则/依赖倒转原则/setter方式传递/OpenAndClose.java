package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.setter方式传递;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 11:18
 */
public class OpenAndClose implements IOpenAndClose {
    private ITV itv;

    public void setItv(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        if (itv != null) {
            itv.play();
        }
    }

    @Override
    public void close() {

    }
}