package cn.zhaojishun.javaBase.数据结构与算法.数据结构.队列;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-07-06 19:26
 */
public class LinkedQueue {

    class Qnode{
        String data;
        Qnode next;
    }

    Qnode headNode;     //头节点

    Qnode front;    //队头指针
    Qnode rear;     //队尾指针

    LinkedQueue(){
      rear = front = headNode = new Qnode();
    }

    //入队
    String enQueue(String emel){
        Qnode qnode = new Qnode();
        qnode.data = emel;
        rear.next = qnode;
        rear = qnode;
        return emel;
    }

    //出队
    String deQueue(){
        if (front == rear) throw new RuntimeException("队空");
        Qnode temp = front.next;                    //要出队的元素
        front.next = temp.next;
        if (rear == temp) rear = front;             //如果要出队的元素是尾节点，那么将尾节点指向头节点
        return temp.data;
    }

    //取头节点
    String getHead(){
        return front.next.data;
    }


}