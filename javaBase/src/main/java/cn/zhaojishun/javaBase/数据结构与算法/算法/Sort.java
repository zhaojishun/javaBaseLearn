package cn.zhaojishun.javaBase.数据结构与算法.算法;

import java.util.Arrays;

/**
 * @program: javaBaseLearn
 * @description: 排序算法
 * @author: Jishun Zhao
 * @create: 2020-07-22 13:15
 */
public class Sort {

    //直接插入排序
    public static void insertSort(int[] data){

        //当前查找的元素变量
        int x ;
        //要插入位置变量
        int j;

        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i-1]){       //如果要插入的位置比它前一个位置大，那么就不用排序了
                x = data[i];
                //寻找 data[i] 的插入位置
                for (j = i-1; j >=0 && x < data[j] ;j--){//从i-1开始，一直找到比x还要小的值
                    data[j+1] = data[j];    //元素后移
                }
                //插入到正确的位置
                data[j+1] = x;
            }
        }
    }

    //希尔排序
    public static void shellSort(int[] arrays) {
        //增量每次都/2
        for (int step = arrays.length / 2; step > 0; step /= 2) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {

                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }

    }

    //希尔排序 dlta 增量序列
    public static void shellSort(int[] data , int[] dlta){
        //按照顺序增量dlta[0...t-1]对顺序表做希尔排序
        //{5,3,1}
        for (int k = 0; k < dlta.length ;k++){
            shellInsert(data,dlta[k]);      //一趟增量为dlta[k]的插入排序
        }

    }

    private static void shellInsert(int[] arrays, int step) {
        //对顺序表arr进行步长为step 的shell排序
        for (int i = step; i < arrays.length; i++) {
            int j = i;
            int temp = arrays[j];

            // j - step 就是代表与它同组隔壁的元素  他的同组元素大
            while (j - step >= 0 && arrays[j - step] > temp) {
                //互换位置
                arrays[j] = arrays[j - step];
                j = j - step;
            }
            arrays[j] = temp;
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] data){

        for (int i = 0; i < data.length; i++) {
            for (int j = data.length-1 ; j > i;j--){
                if (data[j] < data[j-1]){//发生逆序，交换位置
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    //冒泡
    static void test(int[] data){
        boolean flag = true; //未发生交换后面几趟可以省略
        for (int k = 0; k < data.length && flag; k++) {
            flag = false;
            for (int i = 0 ; i < data.length-k-1 ; i++){
                //如果不匹配交换位置
                if (data[i] > data[i+1]){
                    flag = true;
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }
    }

    //快速排序
    public static void QSort(int[] data,int low,int high){
        if (low < high){
            int pivotloc = partition(data,low,high);
            QSort(data,low,pivotloc-1);
            QSort(data,pivotloc+1,high);
        }
    }
    private static int partition(int[] data, int low, int high) {
        //low = 1 high = length-1
        data[0] = data[low];
        data[low]=Integer.MAX_VALUE;
        while (low!=high){
            if(data[low]==Integer.MAX_VALUE){
                if (data[0] > data[high]){
                    data[low]=data[high];
                    data[high]=Integer.MAX_VALUE;
                }else {high--;}
            }else if (data[high]==Integer.MAX_VALUE){
                if (data[0] < data[low]){
                    data[high] = data[low];
                    data[low] = Integer.MAX_VALUE;
                }else {
                    low++;
                }
            }
        }
        data[low] = data[0];
        data[0]=0;
        return low;
    }

    //快速排序2
    public static void QSort2(int[] data , int left , int rigth){
        if (left <= rigth){
            int pivotloc = partition2(data,left,rigth);
            QSort2(data,left,pivotloc-1);
            QSort2(data,pivotloc+1,rigth);
        }
    }
    private static int partition2(int[] data, int left, int rigth) {
        int p = data[left];
        while (left < rigth){
            while (left < rigth && data[rigth] >= p){
                rigth--;
            }
            swap(data,left,rigth);
            while (left < rigth && data[left] <= p){
                left++;
            }
            swap(data,left,rigth);
        }
        return left;
    }
    public static void QSort2(int[] data){
        QSort2(data,0,data.length-1);
    }

    //快速排序3
    public static void QSort3(int[] data , int left , int rigth){
        if (left <= rigth){
            int pivotloc = partition3(data,left,rigth);
            QSort3(data,left,pivotloc-1);
            QSort3(data,pivotloc+1,rigth);
        }
    }
    private static int partition3(int[] data, int left, int rigth) {
        int p = rigth;
        while (left <= rigth){
            while (data[left] < data[p] && left!=rigth){
                left++;
            }
            while (data[rigth] > data[p] && left != rigth){
                rigth--;
            }
            if (left == rigth){
                swap(data,left,p);
                return left;
            }else {
                swap(data,left,rigth);
            }
        }
        return left;
    }
    public static void QSort3(int[] data){
        QSort3(data,0,data.length-1);
    }


    //简单选择排序
    public static void selectSort(int[] data){
        for (int i = 0; i <= data.length - 1; i++) {
            int min = i;    //记录最小元素下标
            //查找最小元素
            for (int k = i ; k <= data.length-1 ;k++){
                if (data[min] > data[k]){
                    min = k;
                }
            }
            //如果当前元素已经是最小的那就不替换
            if (min!=i){
                swap(data,i,min);//替换
            }
        }
    }

    //堆的筛选
    public static void heapAdjust(int[] data , int s , int m){
        //System.out.println(s);
        int rc = data[s];
        for (int j = s * 2; j <= m ; j =j * 2){
            if (j < m && data[j] > data[j+1]){//右孩子小
                j++;
            }
            if (rc <= data[j])break;
            data[s] = data[j];
            s = j;
        }
        data[s] = rc;
    }

    //创建小根堆
    public static void createHeap(int[] data){
        for (int i = (data.length-1)/2 ; i >= 1;i--){
            heapAdjust(data , i , data.length-1);
        }
    }

    //排序
    public static void heapSort(int[] data){
        //初始化
        createHeap(data);
        for (int i = data.length-1 ; i > 1;i--){
            System.out.println(data[1]);
            swap(data , 1 , i);
            heapAdjust(data , 1 ,i-1);
        }
    }


    public static void main(String[] args) {
        //int[] data = {1,5,10,16,7,32,83,23,54,29,96};

//        insertSort(data);
        //shellSort(data);
        //System.out.println(Arrays.toString(data));

        //int[] data1 = {Integer.MAX_VALUE,94,11,96,12,35,17,95,28,58,41,75,15};
        //int[] data1 = {0,49,38,65,97,76,13,27,49};
        //int[] dlta = {5,3,1};
        //shellSort(data1,dlta);

        //bubbleSort(data1);
        //test(data1);
        //QSort(data1,1,data1.length-1);
        //QSort2(data1);
        //System.out.println(Arrays.toString(data1));
        int[] data1 = {21,25,49,25,16,8};
        //QSort3(data1);
        //heapSort(data1);

        //小根堆
        //int[] heap = {0 , 97 , 38 , 27 , 49 , 76 , 65 , 49};
        int[] heap = {0 , 49 , 38 , 65 , 97 , 76 , 13 , 27 , 49};
        //heapAdjust(heap , 1 , heap.length-1);
        heapSort(heap);
        //System.out.println(Arrays.toString(heap));

    }

    //data元素中的 a , b 位置元素值互换
    public static void swap(int[] data , int a , int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

}