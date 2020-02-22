package cn.zhaojishun.javaBase.数组与集合.Collection集合;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-22 12:09
 */
public class SetMain {

    public static void main(String[] args) {
        //set 的数据不能重复，数据重复后自动覆盖
        Set set = new HashSet();
//1.给set 添加数据
// 不能重复，重复自动覆盖
        set.add (2);
        set.add (2);
        set.add ("数学");
        set.add ("语文");

        print(set);

        //Set—查找和遍历
        boolean find = set.contains("生物");
        print (Collections.singleton("找到？" + find));



    }

    /**
     * 打印集合方法
     * @param collection 注意类型是集合Collection
     */
    public static void print(Collection collection) {
        //可以用forEach 简化打印
        collection.forEach (System.out::println);
    }


}