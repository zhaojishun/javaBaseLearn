package cn.zhaojishun.javaBase.数据结构与算法.数据结构.树;


import java.util.Arrays;
import java.util.LinkedList;

/**
 * @program: javaBaseLearn
 * @description: 哈夫曼树
 * @author: Jishun Zhao
 * @create: 2020-07-13 16:59
 */
public class HuffmanTree {

    class HTNode{
        //int weight;         //权重
        double weight;

        char data;
        int parent;         //双亲结点下标
        int lch;            //左孩子下标
        int rch;            //右孩子下标
    }

    HTNode[] nodes;

    // 创建哈夫曼树算法
    //void createHuffmanTree(int[] n){
        void createHuffmanTree(double[] n){
        int m = 2*n.length;  //2 * 8 = 16
        nodes = new HTNode[m];// index 0 - 15  共16个元素 0位置元素不用 1-15 15个元素

        for (int i = 1; i < m; i++) {  //将2n-1个元素的双亲结点左孩子右孩子设置为0
            HTNode node = new HTNode();
            node.lch = 0;
            node.rch = 0;
            node.parent = 0;
            nodes[i] = node;
        }
        //输入前n个元素的weight 值
        for (int i = 1; i < n.length+1; i++) {
            nodes[i].weight = n[i-1];
        }

        for (int i = n.length+1; i <m ; i++) {
            int[] select = select(nodes, i-1);        //获得最小的两个元素
            HTNode node = new HTNode();                         //创建新结点
            nodes[select[0]].parent = i;                        //设置左右孩子的双亲下标
            nodes[select[1]].parent = i;
            node.lch = select[0];                               //设置新结点的左右孩子下标
            node.rch = select[1];
            node.weight = nodes[select[0]].weight + nodes[select[1]].weight;  //新结点的权重等于左右孩子权重的和
            nodes[i] = node;
            //System.out.println(i-1);
        }
    }

    //找到数组中权重最小的两个数的下标  [0] 是第一小的  [1] 是第二小的
    int[] select (HTNode[] arr , int index){
        int m1 ,m2 ;//存储两个最小值的下标

        LinkedList<Integer> arrParents = new LinkedList<>();
        //获得parent值为0的下标集合
        int maxIndex = 1;
        for (int i = 1; i <= index; i++) {
            if (arr[i].parent == 0) arrParents.add(i);
            if (arr[i].weight > arr[maxIndex].weight) maxIndex = i;
        }

        //找到weight最小的两个元素下标
        m1=maxIndex;
        m2=maxIndex;

        for(int i=0;i<arrParents.size();i++){
            if(arr[arrParents.get(i)].weight < arr[m1].weight){
                m2=m1;
                m1=arrParents.get(i);
            }else if(arr[arrParents.get(i)].weight < arr[m2].weight){
                m2=arrParents.get(i);
            }
        }
        int[] ints = new int[2];
        ints[0] = m1;
        ints[1] = m2;
        //System.out.println(m1 +"::" + m2);
        return ints;
    }

    //保存成员下标及code
    class HC{
            int index;
            char[] code;

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append("index:"+index+"--code:"+Arrays.toString(code));
            return sb.toString();
        }
    }

    //创建哈夫曼编码
    void cleatHuffmanCode(int n ){
            //0号位置不用 使用1-7
        HC[] hc = new HC[n+1];
        //保存临时code
        char[] tempCode = new char[n];
        tempCode[n-1] = '-';                //临时code最后一位设置为-号

        //逐个字符求编码
        for (int i = 1; i <= n; i++) {                  //逐个字符求哈夫曼编码
            HTNode tempNode = nodes[i];                 //获得当前结点
            int index = n-2;                            //临时code下标
            int j = i;
            while (tempNode.parent != 0){                //从叶子结点向上回溯，直到根节点
                if (nodes[tempNode.parent].lch == j){   //判断结点在其双亲结点的左侧还是右侧
                    tempCode[index] = '0';                  //左孩子生成0
                }else {
                    tempCode[index] = '1';              //右孩子生成1
                }
                j = tempNode.parent; index--;           //继续向上回溯
                tempNode = nodes[tempNode.parent];      //获取当前结点的双亲结点
            }
            //将得到的临时编码复制到hc中
            HC hc1 = new HC();
            hc1.code = splitTempCode(tempCode);
            hc1.index = i;
            hc[i] = hc1;
        }
        //System.out.println(Arrays.toString(hc));

    }

    //拷贝
    char[] splitTempCode(char[] data){
//        System.out.println(Arrays.toString(data));
//        System.out.println(index);
//        System.out.println(data.length);
        //判断data 有值元素个数
        int index = 0;
        for (int i = 0 ; i <= data.length-2 ;i++){
            if (data[i] != '\u0000'){
                index = i;
                break;
            }
        }
        char[] chars = new char[data.length - 1 - index];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = data[index];
            index++;
        }

        return chars;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < nodes.length; i++) {
            sb.append("index:"+i+"   weight:"+nodes[i].weight
            +"   parent:"+nodes[i].parent
            +"   lch:"+nodes[i].lch
            +"   rch:"+nodes[i].rch+"\r\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /*int[] data = new int[8];
        data[0] = 7;
        data[1] = 19;
        data[2] = 2;
        data[3] = 6;
        data[4] = 32;
        data[5] = 3;
        data[6] = 21;
        data[7] = 10;
        HuffmanTree huffmanTree = new HuffmanTree();
        huffmanTree.createHuffmanTree(data);
        System.out.println(huffmanTree.toString());*/

        double[] data = new double[7];
        data[0] = 0.4;
        data[1] = 0.3;
        data[2] = 0.15;
        data[3] = 0.05;
        data[4] = 0.04;
        data[5] = 0.03;
        data[6] = 0.03;
        //System.out.println(data.length);
        HuffmanTree huffmanTree = new HuffmanTree();
        huffmanTree.createHuffmanTree(data);            //构建哈夫曼树
        //System.out.println(huffmanTree.toString());

        huffmanTree.cleatHuffmanCode(data.length);      //创建哈夫曼编码

    }
}