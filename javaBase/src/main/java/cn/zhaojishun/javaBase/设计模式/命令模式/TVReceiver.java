package cn.zhaojishun.javaBase.设计模式.命令模式;

/**
 * @program: javaBaseLearn
 * @description: Reeeiver 接收者 如何实施或执行一个请求相关的操作
 * @author: Shunji Zhao
 * @create: 2020-02-20 15:46
 */
public class TVReceiver {
    public void on(){
        System.out.println("TV打开");
    }

    public void off(){
        System.out.println("TVoff");

    }
}