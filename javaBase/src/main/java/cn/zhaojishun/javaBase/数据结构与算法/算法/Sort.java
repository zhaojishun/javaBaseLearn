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


    public static void main(String[] args) {
        int[] data = {1,5,10,16,7,32,83,23,54,29,96};

//        insertSort(data);
        shellSort(data);
        //System.out.println(Arrays.toString(data));

        int[] data1 = {81,94,11,96,12,35,17,95,28,58,41,75,15};
        int[] dlta = {5,3,1};
        shellSort(data1,dlta);
        System.out.println(Arrays.toString(data1));

    }

}