package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:38
 */
public class Main {
    public static void main(String[] args) {

        //使用命令设计模式，完成通过遥控器对电灯的操作；
        //创建电灯的对象
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要遥控器
        RemoteController remoteController = new RemoteController();

        //遥控器设置相关命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("开");
        remoteController.onButtonPushed(0);
        System.out.println("关闭");
        remoteController.offButtonPushed(0);
        System.out.println("撤销");
        remoteController.nudoButton();

        //遥控器操作电视机
        TVReceiver tvReceiver = new TVReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);

        TvOnCommand tvOnCommand1 = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);

        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("开");
        remoteController.onButtonPushed(1);
        System.out.println("关闭");
        remoteController.offButtonPushed(1);
        System.out.println("撤销");
        remoteController.nudoButton();
    }
}