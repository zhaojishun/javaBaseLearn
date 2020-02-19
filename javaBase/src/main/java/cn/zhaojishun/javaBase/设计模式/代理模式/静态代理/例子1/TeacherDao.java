package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子1;

/**
 * @program: javaBaseLearn
 * @description: 被代理对象
 * @author: Shunji Zhao
 * @create: 2020-02-19 10:15
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课");
    }
}