package cn.zhaojishun.javaBase.设计模式.结构性模式.外观模式.例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-18 10:20
 */
public class HomeTheaterFacade {

    //定义各个子系统对象
    private Stereo stereo;
    private DVDPlayer dVDPlayer;
    private Lamplight lamplight;

    public HomeTheaterFacade() {
        this.stereo = Stereo.getInstance();
        this.dVDPlayer = DVDPlayer.getInstance();
        this.lamplight = Lamplight.getInstance();
    }
    public void ready() {
        dVDPlayer.on();
        stereo.on();
        lamplight.dim();
    }
    public void play() {
        dVDPlayer.play();
    }
    public void pause() {
        dVDPlayer.pause();
    }
    public void end() {
        dVDPlayer.off();
    }

}