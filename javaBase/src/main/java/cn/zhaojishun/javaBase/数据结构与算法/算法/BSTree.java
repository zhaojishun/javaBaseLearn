package cn.zhaojishun.javaBase.数据结构与算法.算法;

import java.util.HashMap;

/**
 * @program: javaBaseLearn
 * @description: 二叉排序树
 * @author: Jishun Zhao
 * @create: 2020-07-20 12:38
 */
public class BSTree {

    class BSTNode{
        Integer data;

        BSTNode lchild;
        BSTNode rchild;
    }

    BSTNode root;

    int search(int e){
        return search(e,root);
    }

    //二叉排序树的递归查找
    int search(int e , BSTNode node){
        if (node == null) return -1;
        if (node.data == e){
            return node.data;
        }else if (e < node.data){
            return search(e , node.lchild);
        }else {
            return search(e , node.rchild);
        }
    }

    void insert(int e){
        insert(e , root);
    }

    //二叉排序树的插入
    void insert(int e  , BSTNode node){
        if (node == null){          //为空则插入到空树中
            node = new BSTNode();
            node.data = e;
        }else if(e == node.data){   //树中已有不操作
        }else if (e < node.data){
            insert(e , node.lchild);
        }else {
            insert(e , node.rchild);
        }
    }

    //生成二叉排序树
    BSTree create(int[] elems){
        BSTree tree = new BSTree();
        for (int i = 0; i < elems.length; i++) {
            tree.insert(elems[i]);
        }
        return tree;
    }



}