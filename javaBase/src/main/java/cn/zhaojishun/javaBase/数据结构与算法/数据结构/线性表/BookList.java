package cn.zhaojishun.javaBase.数据结构与算法.数据结构.线性表;

import cn.zhaojishun.javaBase.数据结构与算法.常量.Const;

import java.util.ArrayList;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-06-29 17:53
 */
public class BookList {
    final int MAXSIZE = 20;
    int lenth;
    Book[] book;

    BookList(){
        book = new Book[MAXSIZE];
        lenth = 0;
    }

    BookList(int size){
        book = new Book[size];
        lenth = 0;
    }

    void DestroyList(){
        book = null;
    }

    void clearList(){
        lenth = 0;
    }

    int getLenth(){
        return lenth;
    }

    boolean isEmpty(){
        return lenth == 0 ? true : false ;
    }
    //根据位置获得元素
    Book getElem(int i){
        if (i<1||i>lenth)                               //判断位置是否合理
            throw new ArrayIndexOutOfBoundsException();
        return book[i-1];                               //第i-1的单元存储这第i个数据
    }

    //查找元素
    int locateElem(Book b){
        for (int i = 0; i < book.length; i++) {
            if (book[i] == b) return i+1;
        }
        return 0;
    }

    //插入元素
    int listInsert(Book b , int i){
        if (i<1 || i>lenth+1) throw new ArrayIndexOutOfBoundsException();       //判断插入位置是否合法
        if (lenth == MAXSIZE) throw  new RuntimeException();       //当前存储空间已满
        for (int j = lenth-1; j>lenth-1; j--){
            book[j+1] = book[j];                        //插入位置及之后的元素后移
        }
        book[i-1] = b;                                  //将元素e放到第i个位置
        lenth++;                                        //表增长
        return Const.OK;
    }

    //删除元素
    int listDelete(int i){
        if (i<1 || i>lenth) throw new ArrayIndexOutOfBoundsException();       //判断删除位置是否合法
        for (int j = i;j<=lenth-1;j++){
            book[j-1] = book[j];
        }
        lenth--;
        return Const.OK;
    }

    //添加元素
    int add(Book b){
        if (lenth == MAXSIZE) throw  new RuntimeException();       //当前存储空间已满
        book[lenth] = b;
        lenth++;
        return Const.OK;
    }

    @Override
    public String toString() {
        for (int i = 0; i < lenth; i++) {
            System.out.println(book[i].toString());
        }
        return super.toString();
    }
}
class Book{
    Long ISBN;
    String name;
    float price;

    @Override
    public String toString() {
        return "ISBN:"+ISBN+"name:"+name+"price:"+price;
    }
}

class test{
    public static void main(String[] args) {
        BookList b = new BookList();
        Book c = new Book();
        c.ISBN = 12321312312321L;
        b.add(c);
        System.out.println(b);
    }
}