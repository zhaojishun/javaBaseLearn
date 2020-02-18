package cn.zhaojishun.javaBase.设计模式.结构性模式.外观模式.例子;

/**
 * @program: javaBaseLearn
 * @description: 电影机
 * @author: Shunji Zhao
 * @create: 2020-02-18 10:13
 */
public class DVDPlayer {

    private static DVDPlayer dvdPlayer = new DVDPlayer();
    private DVDPlayer() {
    }

    public static DVDPlayer getInstance (){
        return dvdPlayer;
    }

    public void on(){
        System.out.println("dvd on");

    }
    public void off(){
        System.out.println("dvd off");

    }
    public void pause(){
        System.out.println("dvd pause");
    }

    public void play(){
        System.out.println("dvd play");
    }
}