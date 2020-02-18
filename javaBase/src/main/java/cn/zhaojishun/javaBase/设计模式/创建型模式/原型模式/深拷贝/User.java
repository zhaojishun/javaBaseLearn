package cn.zhaojishun.javaBase.设计模式.创建型模式.原型模式.深拷贝;

import java.io.*;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-11 09:49
 */
public class User implements Cloneable , Serializable {

    private String name;
    private int age;
    private IdCard idCard;

    public User(String name, int age, IdCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard=" + idCard +
                '}';
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

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

    @Override
    protected Object clone(){
        User u = null;
        try {
            u = (User) super.clone();
            //clone方式深拷贝，引用类型单独处理
            u.setIdCard((IdCard) idCard.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return u;
    }

    //使用序列化方式
    public Object deepClone() {
//创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
//序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
//反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            User copyObj = (User)ois.readObject();
            return copyObj;
        } catch (Exception e) {
// TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
//关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
// TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }
    }
}