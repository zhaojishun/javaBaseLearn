package cn.zhaojishun.javaBase.数据结构与算法.数据结构.线性表.线性表的应用;


import cn.zhaojishun.javaBase.数据结构与算法.常量.Const;

import java.util.Arrays;

/**
 * @program: javaBaseLearn
 * @description: 有序表合并-顺序表实现
 * @author: Jishun Zhao
 * @create: 2020-07-03 20:16
 */
public class IntList {

    final int MAXSIZE = 20;

    int[] data;

    int length;

    IntList(){
        data = new int[MAXSIZE];
        length = 0;
    }

    IntList(int size){
        data = new int[size];
        length = 0;
    }

    void DestroyList(){
        data = null;
    }

    void clearList(){
        length = 0;
    }

    int getLenth(){
        return length;
    }

    boolean isEmpty(){
        return length == 0 ? true : false ;
    }

    //根据位置获得元素
    int getElem(int i){
        if (i<1||i>length)                               //判断位置是否合理
            throw new ArrayIndexOutOfBoundsException();
        return data[i-1];                               //第i-1的单元存储这第i个数据
    }

    //查找元素
    int locateElem(int b){
        for (int i = 0; i < length; i++) {
            if (data[i] == b) return i+1;
        }
        return 0;
    }

    //设置监视哨的顺序查找
    int seachElem(int e){
        data[0] = e;
        int i = data.length;
        for (; data[i] != e ; i--);
        return i;
    }

    //二分查找
    int binSearch(int e){
        int left = 1;       //低位
        int rigth = data.length;//高位
        while (left <= rigth){
            int mid = (left + rigth) / 2;
            if (data[mid] == e){                 //找到待查元素
                return mid;
            }else if (e < data[mid]){           //缩小查找区间
                rigth = mid-1;                  //在前半区查找
            } else {
                left = mid+1;               //在后半区查找
            }
        }
        return 0;
    }


    //插入元素
    int listInsert(int b , int i){
        if (i<1 || i>length+1) throw new ArrayIndexOutOfBoundsException();       //判断插入位置是否合法
        if (length == MAXSIZE) throw  new RuntimeException();       //当前存储空间已满
        for (int j = length-1; j>length-1; j--){
            data[j+1] = data[j];                        //插入位置及之后的元素后移
        }
        data[i-1] = b;                                  //将元素e放到第i个位置
        length++;                                        //表增长
        return Const.OK;
    }

    //添加元素
    int add(int b){
        if (length == MAXSIZE) throw  new RuntimeException();       //当前存储空间已满
        data[length] = b;
        length++;
        return Const.OK;
    }

    //合并线性表
    IntList mergeList(IntList b){
        IntList intList = new IntList(b.length + length);
        //创建两个指针
        int aList = 0;
        int bList = 0;

        loop:while (true){
            //当一个表空了
            if (aList == length || bList == b.length){
                break loop;
            }
            if (data[aList] < b.data[bList]){
                intList.add(data[aList]);
                aList++;
            }else {
                intList.add(b.data[bList]);
                bList++;
            }
        }
        //如果a表空了
        for (int i = bList; i < b.length; i++) {
            intList.add(b.data[i]);
        }
        //如果b表空了
        for (int i = aList; i < length; i++) {
            intList.add(data[i]);
        }
        return intList;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(1);
        a.add(7);
        a.add(8);

        IntList b = new IntList();
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(8);
        b.add(10);
        b.add(11);

        IntList intList = a.mergeList(b);

        System.out.println(intList.toString());


    }
}