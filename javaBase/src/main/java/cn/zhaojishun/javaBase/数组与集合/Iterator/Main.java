package cn.zhaojishun.javaBase.数组与集合.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 10:49
 */
public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("444");
        list.add("443");
        list.add("445");
        list.add("446");
        list.add("447");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}