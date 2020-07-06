package cn.zhaojishun.javaBase.数据结构与算法.数据结构.栈;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-07-06 09:56
 */
public class LinkedStack {

    class Node{
        int data;
        Node next;
    }

    Node data;

    //初始化
    LinkedStack(){
        data = null;
    }

    //判断是否为空
    boolean empty(){return data == null;}

    //入栈
    int push(int emel){
        Node node = new Node();  //创建新节点p
        node.data = emel;        //设置新节点数据
        node.next = data;        //节点next域指向栈顶指针
        data = node;            //将栈顶指针指向新节点
        return emel;
    }

    //出栈
    int pop(){
        if (empty()){                           //判断是否还有元素
            throw new StackOverflowError();     //没有元素抛出错误
        }else {
            int emel = data.data;               //保存栈顶数据方便返回
            data = data.next;                        //将栈顶指针指向 栈顶的下一个元素
            return emel;
        }
    }

    //获得栈顶元素
    int topEmel(){
        if (empty()){
            throw new StackOverflowError();
        }else {
            return data.data;
        }
    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        for (int i = 0; i < 10; i++) {
            linkedStack.push(i);
        }

        while (!linkedStack.empty()){
            System.out.println(linkedStack.pop());
        }
    }

}