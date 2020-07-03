package cn.zhaojishun.javaBase.数据结构与算法.数据结构.线性表;

import java.util.LinkedList;

/**
 * @program: javaBaseLearn
 * @description: 双向循环链表
 * @author: Jishun Zhao
 * @create: 2020-07-02 18:07
 */
public class DuLinkedList {

    class DuNode{
        String data;
        DuNode prior;   //上一节点
        DuNode next;    //下一节点

        public DuNode() {
        }

        public DuNode(String data, DuNode prior, DuNode next) {
            this.data = data;
            this.prior = prior;
            this.next = next;
        }
    }

    DuNode head;        //头节点

    DuLinkedList(){
        head = new DuNode();
        head.prior = head;
        head.next = head;
    }

    //获得第几个元素
    DuNode getElem(int i){
        int index = 1;
        DuNode temp = head.next;
        while (temp != null && index < i){
            temp = temp.next;
            index++;
        }
        if (temp.next != null) return temp;
        return null;
    }

    //插入
    boolean add(String data , int i){
        DuNode p = getElem(i);
        if (p!=null){
            DuNode s = new DuNode();s.data = data;
            s.prior = p.prior;
            s = p.prior.next;
            s.next = p;
            p.prior = s;
            return true;
        }else {
            return false;
        }
    }

    //删除
    boolean remove(int i){
        DuNode p = getElem(i);
        if (p!=null){
            p.prior.next = p.next;
            p.next.prior = p.prior;
            return true;
        }else {
            return false;
        }
    }

}