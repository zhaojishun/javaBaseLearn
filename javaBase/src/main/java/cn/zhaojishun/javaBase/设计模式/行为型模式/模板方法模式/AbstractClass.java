package cn.zhaojishun.javaBase.设计模式.行为型模式.模板方法模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-20 10:03
 */
public abstract class AbstractClass {

    private Long startTime;
    private Long endTime;

    final void templateMethod(){
        start();
        if (hook()) {
            doSomething();
        }
        end();
    }

    void start(){
        startTime = System.currentTimeMillis();
    };

    void end(){
        endTime = System.currentTimeMillis();
        System.out.println("耗时："+ (endTime - startTime) +"ms" );
    }

    abstract void doSomething();

    //钩子方法
    public boolean hook(){
        return false;
    }
}