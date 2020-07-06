package cn.zhaojishun.javaBase.数据结构与算法.数据结构.队列;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-07-06 18:25
 */
public class SqQueue {

    final int MAXSIZE = 20;

    String[] data;

    int front;      //头指针
    int rear;       //尾指针

    SqQueue(){
        data = new String[MAXSIZE];
        front = rear = 0;
    }

    //获得队列元素个数
    int size(){return (rear - front + MAXSIZE) % MAXSIZE;}

    //元素入队
    String enQueue(String elem){
        if ((rear + 1) % MAXSIZE == front)             //判断是否队满
            throw new RuntimeException("队列已满");
        data[rear] = elem;                              //新元素加入队尾
        rear = (rear + 1) % MAXSIZE;                    //尾指针+1，求模可以在尾指针到最大下标时重新回到0位置
        return elem;
    }

    //元素出对
    String deQueue(){
        if (front == rear) throw new RuntimeException("队空");    //队空判断
        String res = data[front];                                   //取出对头元素
        front = (front + 1) % MAXSIZE;                    //头指针+1，求模可以在头指针到最大下标时重新回到0位置
        return res;
    }

    //取队头元素
    String getHead(){
        if (front == rear) throw new RuntimeException("队空");
        return data[front];
    }

//    SqQueue(int size){
//        data = new String[size];
//        front = rear = 0;
//    }

    public static void main(String[] args) {
        System.out.println(5%6);
    }

}