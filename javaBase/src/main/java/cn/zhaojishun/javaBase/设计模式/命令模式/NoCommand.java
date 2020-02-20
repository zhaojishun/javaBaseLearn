package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description: 没有任何命令，用于初始化每个按钮，当调用空命令时，对象什么也不做，可以省掉对空的判断。
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:25
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}