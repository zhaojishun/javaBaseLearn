package cn.zhaojishun.javaBase.设计模式.桥接模式.基本代码;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-16 10:07
 */
public class Abstraction {

    protected Implementeor implementeor;

    public void setImplementeor(Implementeor implementeor) {
        this.implementeor = implementeor;
    }

    public void operation(){
        implementeor.operation();
    }


}