package cn.zhaojishun.javaBase.数据结构与算法.算法;

import java.util.Arrays;

/**
 * @program: javaBaseLearn
 * @description: 将一位数组中的n个元素逆序放到原数组中
 * @author: Jishun Zhao
 * @create: 2020-06-29 08:10
 */
public class ArrayExchange {

    public static void main(String[] args) {
        int[] nubers = {1,2,3,4,5,6,7,8,9};
        for (int i = 0 ; i<nubers.length/2;i++){
            int temp = nubers[i];
            nubers[i] = nubers[nubers.length-i-1];
            nubers[nubers.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(nubers));
    }
}