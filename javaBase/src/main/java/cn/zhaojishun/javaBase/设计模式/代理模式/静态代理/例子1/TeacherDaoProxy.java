package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子1;

/**
 * @program: javaBaseLearn
 * @description: 代替被代理对象的代理对象
 * @author: Shunji Zhao
 * @create: 2020-02-19 10:16
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    private TeacherDaoProxy(){};

    @Override
    public void teach() {
        System.out.println("老师点名");
        iTeacherDao.teach();
        System.out.println("老师下课");
    }
}