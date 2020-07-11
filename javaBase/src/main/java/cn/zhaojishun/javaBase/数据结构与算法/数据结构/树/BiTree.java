package cn.zhaojishun.javaBase.数据结构与算法.数据结构.树;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-07-11 17:24
 */
public class BiTree {

    class BiNode{
        char data;
        BiNode leftChild;
        BiNode rigthChild;
    }

    BiNode root;


    //先序遍历
    public static void preOrderTraverse (BiNode node){
        if (node == null) return;

        System.out.println(node.data);          //输出根节点数据

        preOrderTraverse(node.leftChild);       //遍历左子树
        preOrderTraverse(node.rigthChild);      //遍历右子树
    }

    //中序遍历遍历
    public static void inOrderTraverse (BiNode node){

        if (node == null) return;

        inOrderTraverse(node.leftChild);        //遍历左子树

        System.out.println(node.data);          //输出根节点数据

        inOrderTraverse(node.rigthChild);       //遍历右子树
    }

    //后序遍历
    public static void postOrderTraverse (BiNode node){

        if (node == null) return;

        inOrderTraverse(node.leftChild);        //遍历左子树
        inOrderTraverse(node.rigthChild);       //遍历右子树

        System.out.println(node.data);          //输出根节点数据
    }
}