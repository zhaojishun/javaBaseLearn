package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description: ConcreteCommand 将一个接收者对象于一个动作绑定，调用接收者相应的操作，实现excute
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:24
 */
public class LightOffCommand implements Command{
    //聚合lightrecever
    LightReceiver lightReceiver;
    @Override
    public void execute() {
        //调用接收者方法
        lightReceiver.off();
    }

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}