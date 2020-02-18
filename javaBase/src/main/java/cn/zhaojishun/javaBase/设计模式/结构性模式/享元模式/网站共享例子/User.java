package cn.zhaojishun.javaBase.设计模式.结构性模式.享元模式.网站共享例子;

/**
 * @program: javaBaseLearn
 * @description: 外部状态
 * @author: Shunji Zhao
 * @create: 2020-02-18 17:51
 */

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}