package cn.zhaojishun.javaBase.数据结构与算法.数据结构.树;

/**
 * @program: javaBaseLearn
 * @description: 双亲表示法
 * @author: Jishun Zhao
 * @create: 2020-07-12 20:22
 */
public class Ptree {

    class PTNode{
        char data;
        int parent;
    }

    static final int MAX_TREESIZE = 100;

    PTNode[] nodes;

    int r;

    int n;
}