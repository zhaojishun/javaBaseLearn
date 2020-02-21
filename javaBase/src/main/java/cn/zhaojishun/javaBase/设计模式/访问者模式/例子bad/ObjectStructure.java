package cn.zhaojishun.javaBase.设计模式.访问者模式.例子bad;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 09:20
 */
public class ObjectStructure {

    //维护集合
    private List<Person> people = new LinkedList<>();

    public void attach(Person p){
        people.add(p);
    }

    //移除
    public void detach(Person p){
        people.remove(p);
    }
    
    //显示评测情况
    public void display(Action a){
        for (Person person : people) {
            person.accept(a);
        }
    }
}