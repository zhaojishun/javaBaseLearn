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

    int vexmun;                             //图的当前顶点数

    int arcnnum;                             //图的当前边数

    AMGraph(){
        vexs = new char[MVNum];
        arcs = new int[MVNum][MVNum];
        vexmun = 0;
        arcnnum = 0;
    }

    //深度优先搜索遍历  v 开始遍历的顶点
    void DFS(int v){
        //创建辅助数组
        System.out.println(vexs[v]);
        boolean[] visited = new boolean[vexmun];
        visited[v] = true;
        //依次检查 v 所在行的定点
        for (int w = 0; w < vexmun; w++) {
            if (arcs[v][w] != 0 && !visited[w]){
                DFS(w);
            }
        }
    }
}