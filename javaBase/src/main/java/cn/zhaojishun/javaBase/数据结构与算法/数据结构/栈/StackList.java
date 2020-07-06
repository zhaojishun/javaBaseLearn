package cn.zhaojishun.javaBase.数据结构与算法.数据结构.栈;

import java.util.EmptyStackException;

/**
 * @program: javaBaseLearn
 * @description: 线性表实现的栈
 * @author: Jishun Zhao
 * @create: 2020-07-05 12:45
 */
public class StackList {

    final int defaultSize = 20;

    int data[];

    int top;

    int base;

    int stackSize;  //容量

    StackList(int size){
        data = new int[size];
        stackSize = size;
        top = 0;            //存储顶元素+1的下标
        base = 0;           //存储底元素的下标
    }

    StackList(){
        data = new int[defaultSize];
        stackSize = defaultSize;
        top = 0;
        base = 0;
    }

    int push(int item){
        if (top == 0 && base == 0){base = item;}
        if(top-base == stackSize){throw new StackOverflowError();}
        data[top] = item;
        top++;
        return item;
    }

    int pop(){
        if (empty()){
            throw new EmptyStackException();
        }else {
            int item = data[top-1];
            top--;
            return item;
        }
    }

    //清空栈
    void clear(){top = base;}

    int size(){return top-base;}

    boolean empty(){return base==top;}

    int getTop(){return data[top-1];}

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        StackList stackList = new StackList();
        for (int i = 0; i < 19; i++) {
            stackList.push(i);
        }
        while (!stackList.empty()){
            System.out.println(stackList.pop());
        }
    }
}