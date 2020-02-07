package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递;

import cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递.ITV;
import cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.构造方法传递.ITvOpenAndClose;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 10:55
 */
public class OpenAndClose implements ITvOpenAndClose {
    public ITV itv;

    OpenAndClose(ITV itv){
        this.itv = itv;
    }
    @Override
    public void open() {
        itv.play();
    }

    @Override
    public void close() {

    }


}