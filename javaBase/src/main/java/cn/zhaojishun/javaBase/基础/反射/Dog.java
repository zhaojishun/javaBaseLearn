package cn.zhaojishun.javaBase.基础.反射;

/**
 * @author 顺
 * @Title: Dog
 * @ProjectName javaBaseLearn
 * @Description: TODO
 * @date 2020/1/2712:34
 */
public class Dog {

    private String name;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("abg");
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
