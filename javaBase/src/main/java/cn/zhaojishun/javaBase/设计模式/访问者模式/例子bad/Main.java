package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 09:26
 */
public class Main {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new WoMan());

        Scuuess scuuess = new Scuuess();
        objectStructure.display(scuuess);

        Fail f = new Fail();
        objectStructure.display(f);
    }

}