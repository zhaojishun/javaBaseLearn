package cn.zhaojishun.javaBase.数据结构与算法.数据结构.线性表;

import java.util.LinkedList;

/**
 * @program: javaBaseLearn
 * @description: 单链表
 * @author: Jishun Zhao
 * @create: 2020-07-01 16:22
 */
public class LinkList {

    private static class Node{

        Student student;
        Node next;

        public Node(Student student, Node next) {
            this.student = student;
            this.next = next;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node() {
        }
    }

    Node head;

    int size;

    LinkList(){
        head = new Node();
        size = 0;
    }

    boolean listEmpty(){
        return head.next == null ? true : false;
    }


    //清空链表
    void clear(){
        Node temp = head;
        while (temp != null){
            Node next = temp.next;
            temp.next = null;
            temp.student = null;
            temp = next;
        }
        size = 0;
    }

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
    Student getElem(int i){
        int index = 1;
        Node temp = head.next;
        while (temp != null && index < i){
            temp = temp.next;
            index++;
        }
        if (temp.next != null) return temp.student;
        return null;
    }

    //查找元素
    Student findElem(Student s){
        int index = 1;
        Node temp = head.next;
        while (temp != null && temp.student != s){
           temp = temp.next;
        }
        return temp.student;
    }

    //查找元素的位置序号
    int indexof(Student s){
        int index = 1;
        Node temp = head.next;
        while (temp != null && temp.student != s){
            temp = temp.next;
            index ++;
        }
        return temp==null ? 0 : index;
    }

    //插入节点
    void set(int i , Student s){
        Node p = head.next ; int index = 1;
        while (p != null && index < i-1){
            p = p.next;
            index++;
        }
        if(p!=null){
            Node node = new Node(s, p.next);
            p.next = node;
        }
    }

    //删除节点
    void delete(int i){
        Node p = head.next ;int index = 1;
        while (p != null && index < i-1){
            p = p.next;
            index++;
        }
        if(p.next!=null){
            p.next = p.next.next;
        }
    }

    //头插法
    void createListHead(int n){
        head.next = null;
        head = new Node();
        for (int i = n; i > 0; i--) {
            Node node = new Node();
            node.next = head.next;
            head.next = node;
        }
    }

    //尾插法
    void createListEnd(int n){
        head.next = null;
        head = new Node();
        Node end = head;                //尾指针指向头节点
        for (int i = 0; i < n; i++) {
            Node node = new Node();
            end.next = node;            //尾指针next指向当前节点
            node.next = null;
            end = node;
        }
    }


}


class Student{
    String name;
    int score;
}

