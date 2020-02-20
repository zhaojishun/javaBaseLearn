package cn.zhaojishun.javaBase.设计模式.行为型模式.模板方法模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 10:08
 */
public class ConcreteClass extends AbstractClass{
    @Override
    void doSomething() {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }
        System.out.println(str);
    }

    @Override
    public boolean hook() {
        return true;
    }
}