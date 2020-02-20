package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:46
 */
public class TvOffCommand implements Command {
    //聚合lightrecever
    TVReceiver tVReceiver;
    @Override
    public void execute() {
        //调用接收者方法
        tVReceiver.off();
    }

    public TvOffCommand(TVReceiver tVReceiver) {
        this.tVReceiver = tVReceiver;
    }

    @Override
    public void undo() {
        tVReceiver.on();
    }
}