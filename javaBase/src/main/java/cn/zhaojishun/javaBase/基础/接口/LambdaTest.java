package cn.zhaojishun.javaBase.基础.接口;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: javaBaseLearn
 * @description: Lambda 学习
 * @author: Shunji Zhao
 * @create: 2020-01-31 11:33
 */
public class LambdaTest {

    public static void main(String[] args) {

        //字符串长度排序 Lambda
        String[] str = {"a","av","avv","tesss","s0","s","ssssss"};
        Arrays.sort(str,(a,b)-> a.length() - b.length());
        System.out.println(Arrays.toString(str));

        String[] str2 = {"a","av","avv","tesss","s0","s","ssssss"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(str));

    }



}