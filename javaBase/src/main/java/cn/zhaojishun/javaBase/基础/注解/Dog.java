package cn.zhaojishun.javaBase.基础.注解;

/**
 * @author 顺
 * @Title: Dog
 * @ProjectName javaBaseLearn
 * @Description: TODO
 * @date 2020/1/2712:34
 */
public class Dog {

    private  @NotNull String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


}
