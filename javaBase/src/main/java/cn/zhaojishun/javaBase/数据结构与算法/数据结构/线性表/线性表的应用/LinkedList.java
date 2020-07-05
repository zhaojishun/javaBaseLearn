package cn.zhaojishun.javaBase.数据结构与算法.数据结构.线性表.线性表的应用;



/**
 * @program: javaBaseLearn
 * @description: 线性表合并
 * @author: Jishun Zhao
 * @create: 2020-07-03 17:17
 */
public class LinkedList {

    private static class Node{

        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node() {
        }
    }

    Node head; //头节点

    int size;

    //获得链表长度
    int size(){
        int num = 0;
        Node temp = head.next;
        while (temp != null){
            Node next = temp.next;
            temp = next;
            num++;
        }
        return num;
    }

    //获得第几个元素
    int getElem(int i){
        int index = 1;
        Node temp = head.next;
        while (temp != null && index < i){
            temp = temp.next;
            index++;
        }
        if (temp.next != null) return temp.data;
        return 0;
    }

    //查找元素
    int findElem(int s){
        int index = 1;
        Node temp = head.next;
        while (temp != null && temp.data != s){
            temp = temp.next;
        }
        return temp.data;
    }

    //插入节点
    void set(int i , int data){
        Node p = head.next ; int index = 1;
        while (p != null && index < i-1){
            p = p.next;
            index++;
        }
        if(p!=null){
            Node node = new Node(data, p.next);
            p.next = node;
        }
    }

    //线性表的合并
    void union(LinkedList list){
        int asize = size();//当前链表长度
        int bsize = list.size();
        for (int i = 1; i < bsize; i++) {
            int elem = list.getElem(i);
            if (getElem(elem)!=0) set(asize+1,elem);
        }
    }

}