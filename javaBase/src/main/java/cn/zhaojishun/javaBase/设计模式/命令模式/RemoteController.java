package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description: 调用者
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:28
 */
public class RemoteController {

    // 定义按钮
    Command[] onCommand;
    Command[] offCommand;

    Command undoCommand;

    public RemoteController() {
        onCommand = new Command[5];
        offCommand = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    //给按钮设置你需要的命令
    public void setCommand(int no , Command onCommandd , Command offCommandd){
        onCommand[no] = onCommandd;
        offCommand[no] = offCommandd;
    }

    //按下打开按钮
    public void onButtonPushed(int no){

        onCommand[no].execute();
        //记录这次的操作
        undoCommand = onCommand[no];
    }

    //按下关闭按钮
    public void offButtonPushed(int no){

        offCommand[no].execute();
        //记录这次的操作
        undoCommand = offCommand[no];
    }

    //按下撤销按钮
    public void nudoButton(){
        undoCommand.undo();
    }

}