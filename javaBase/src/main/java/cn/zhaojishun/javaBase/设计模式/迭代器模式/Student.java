package cn.zhaojishun.javaBase.设计模式.迭代器模式;

import lombok.Data;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 10:56
 */
@Data
public class Student {
    private String name;
    private Integer number;

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public void count() {
        System.out.println(String.format("我是 %d 号 %s", this.number, this.name));
    }
}