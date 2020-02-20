package cn.zhaojishun.javaBase.设计模式.命令模式;

// 声明执行操作的接口
public interface Command {

    //执行动作
    void execute();

    //撤销动作
    void undo();

}
