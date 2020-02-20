package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:20
 */
public class LightOnCommand implements Command {

    //聚合lightrecever
    LightReceiver lightReceiver;
    @Override
    public void execute() {
        //调用接收者方法
        lightReceiver.on();
    }

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}