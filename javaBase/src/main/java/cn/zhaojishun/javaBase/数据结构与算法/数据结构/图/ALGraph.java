package cn.zhaojishun.javaBase.数据结构与算法.数据结构.图;

/**
 * @program: javaBaseLearn
 * @description: 邻接表表示法
 * @author: Jishun Zhao
 * @create: 2020-07-16 17:11
 */
public class ALGraph {

    class VNode{
        char data;          //顶点信息
        ArcNode firstArc;   //指向第一条依附该顶点的边的指针
    }

    //边结点
    class ArcNode{
        int adjvex;         //该边所指向的顶点位置
        ArcNode nextArc;    //指向下一条边的指针
        int otherInfo;      //和边相关的其他信息，例如权值
    }

    VNode[] nodes;          //顶点列表
    int vexNum;             //当前定点数
    int arcNum;             //当前弧数
}