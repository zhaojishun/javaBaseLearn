package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:49
 */
public class TvOnCommand  implements Command{
    //聚合lightrecever
    TVReceiver tVReceiver;
    @Override
    public void execute() {
        //调用接收者方法
        tVReceiver.on();
    }

    public TvOnCommand(TVReceiver tVReceiver) {
        this.tVReceiver = tVReceiver;
    }

    @Override
    public void undo() {
        tVReceiver.off();
    }
}