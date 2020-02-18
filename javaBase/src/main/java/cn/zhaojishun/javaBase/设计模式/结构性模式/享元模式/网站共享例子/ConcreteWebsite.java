package cn.zhaojishun.javaBase.设计模式.结构性模式.享元模式.网站共享例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-18 17:53
 */
public class ConcreteWebsite extends Website {

    //网站类型 维护的内部状态
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName()+"使用了"+type+"类型的网站");
    }
}