package cn.zhaojishun.javaBase.设计模式.原型模式.深拷贝;

import java.io.Serializable;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-11 10:21
 */
public class IdCard implements Cloneable , Serializable {
    private int id;

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IdCard(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}