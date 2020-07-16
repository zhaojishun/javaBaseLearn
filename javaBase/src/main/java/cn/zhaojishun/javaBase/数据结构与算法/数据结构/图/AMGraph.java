package cn.zhaojishun.javaBase.数据结构与算法.数据结构.图;

/**
 * @program: javaBaseLearn
 * @description: 邻接矩阵
 * @author: Jishun Zhao
 * @create: 2020-07-15 18:18
 */
public class AMGraph {

    //表示极大值
    static final int MAXINT = Integer.MAX_VALUE;

    //最大顶点数
    static final int MVNum = 100;

    char[] vexs;            //顶点表

    int[][] arcs;        //邻接矩阵

    int vexmun;                             //图的当前定点数

    int arcnnum;                             //图的当前边数

    AMGraph(){
        vexs = new char[MVNum];
        arcs = new int[MVNum][MVNum];
        vexmun = 0;
        arcnnum = 0;
    }
}