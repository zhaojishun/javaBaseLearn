package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子2;

/**
 * @program: javaBaseLearn
 * @description: 中介 代理角色
 * @author: Shunji Zhao
 * @create: 2020-02-19 10:38
 */
public class Intermediary implements IHouse {

    //房东
    private IHouse iandlord;

    private Intermediary() {

    }

    public Intermediary(IHouse iandlord) {
        this.iandlord = iandlord;
    }

    @Override
    public void house() {
        kanfang();
        hetong();
        iandlord.house();
        shouzu();
    }

    //看房
    private void kanfang(){
        System.out.println("中介领看房");
    }

    //签合同
    private void hetong(){
        System.out.println("中介签合同");
    }


    //收租
    private void shouzu(){
        System.out.println("中介收租");
    }

}