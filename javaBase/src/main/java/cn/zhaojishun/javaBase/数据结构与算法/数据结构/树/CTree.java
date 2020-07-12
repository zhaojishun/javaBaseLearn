package cn.zhaojishun.javaBase.数据结构与算法.数据结构.树;

/**
 * @program: javaBaseLearn
 * @description: 孩子链表
 * @author: Jishun Zhao
 * @create: 2020-07-12 20:34
 */
public class CTree {

    //定义孩子结点结构
    class CTNode{

        int child;  //孩子结点的下标

        CTNode next; //下一个孩子结点

    }

    class CTBox{

        char data;      //存储的数据

        CTNode firstChild; //第一个孩子结点

        //int parent;         //双亲位置  加上变成孩子链表
    }

    static final int MAX_TREESIZE = 100;

    CTBox[] nodes;

    int r;      //根节点下标

    int n;      //结点数
}