package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子1;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 10:19
 */
public class Main {

    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}