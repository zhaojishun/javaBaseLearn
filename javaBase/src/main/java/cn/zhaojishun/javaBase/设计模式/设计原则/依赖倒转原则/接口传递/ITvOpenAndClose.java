package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.接口传递;

public interface ITvOpenAndClose {
    void open(ITV tv);
    void close(ITV ev);
}
