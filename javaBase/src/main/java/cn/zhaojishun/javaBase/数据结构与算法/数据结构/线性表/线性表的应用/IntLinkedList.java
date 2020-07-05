package cn.zhaojishun.javaBase.数据结构与算法.数据结构.线性表.线性表的应用;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-07-04 15:32
 */
public class IntLinkedList {

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

    IntLinkedList(){
        head = new Node();
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

    //插入节点
    void set(int data){
        Node p = head.next;
        if (p == null){
            Node node = new Node(data,null);
            head.next = node;
        }else {
            while (p.next != null){
                p = p.next;
            }
            Node node = new Node(data,null);
            p.next = node;
        }
    }



    public static Node merge(Node list1,Node list2){
        //空判断 如果有一个为空则 返回另一个链表
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;

        Node newHead=null;  //结果节点
        Node tmp=null;      //临时指针
        //往新链表一个个添加节点 直至有一个链表为空
        //tmp存放最后一个添加进新链表的节点 用于后续的拼接
        while(list1!=null&&list2!=null){
            if(list1.data<list2.data){
                if(newHead==null){
                    newHead=tmp=list1;
                }else{
                    tmp.next=list1;
                    tmp=tmp.next;
                }
                list1=list1.next;
            }else{
                if(newHead==null){
                    newHead=tmp=list2;
                }else{
                    tmp.next=list2;
                    tmp=tmp.next;
                }
                list2=list2.next;
            }
        }
        //拼接剩余链表至新链表尾节点
        if(list1==null){
            tmp.next=list2;
        }else{
            tmp.next=list1;
        }
        return newHead;
    }

    //递归法
    public static Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        Node mergedNode;
        if (l1.data < l2.data) {
            mergedNode = l1;
            mergedNode.next = mergeTwoLists(l1.next, l2);
        } else {
            mergedNode = l2;
            mergedNode.next = mergeTwoLists(l2.next, l1);
        }
        return mergedNode;
    }

    @Override
    public String toString() {
        Node a = head.next;
        String  string = "";
        while (a != null){
            string += a.data+",";
            a = a.next;
        }
        return string;
    }

    public static void main(String[] args) {
        IntLinkedList a = new IntLinkedList();
        a.set(1);
        a.set(7);
        a.set(8);

        IntLinkedList b = new IntLinkedList();
        b.set(2);
        b.set(4);
        b.set(6);
        b.set(8);
        b.set(10);
        b.set(11);

        Node node = merge(a.head.next, b.head.next);
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.head.next = node;


        System.out.println(intLinkedList.toString());
    }
}