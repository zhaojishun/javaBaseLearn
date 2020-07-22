package cn.zhaojishun.javaBase.数据结构与算法.算法;

/**
 * @program: javaBaseLearn
 * @description: 红黑树
 * @author: Jishun Zhao
 * @create: 2020-07-21 17:18
 */
public class RedBlackTree {

    //定义颜色
    private final int R = 0;
    private final int B = 1;

    private Node root = null;   //根节点

    class Node{
        int data;       //数据
        int color = R;  //颜色默认红色
        Node left;      //左孩子
        Node rigth;     //右孩子
        Node parent;    //双亲结点

        public Node(int data) {
            this.data = data;
        }
    }

    //插入
    public void insert(Node node , int data){//root结点一定不为空最开始就默认进去了
        if (node.data < data){
            if (node.rigth == null){
                node.rigth = new Node(data);
            }else {
                insert(node.rigth , data);
            }
        }else {
            if (node.left== null){
                node.left = new Node(data);
            }else {
                insert(node.left , data);
            }
        }
    }

    //左旋
    public void leftRotate(Node node){
        if (node.parent == null){   //根节点左旋
            Node E = node;           //确定E结点和S结点
            Node S = E.rigth;

            E.rigth = S.left;       //将s的左子树挂到e的右子树上
            S.left.parent = E;      //修改S左子树的parent

            //修改e指针
            E.parent = S;
            //修改s指针
            S.parent = null;
            S.left = E;
        }
    }



}