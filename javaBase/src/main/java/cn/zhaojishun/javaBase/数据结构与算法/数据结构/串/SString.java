package cn.zhaojishun.javaBase.数据结构与算法.数据结构.串;

/**
 * @program: javaBaseLearn
 * @description: 顺序串
 * @author: Jishun Zhao
 * @create: 2020-07-07 18:07
 */
public class SString {

    final int MAXSIZE = 255;

    char[] data;

    int lenth;

    SString(){
        data = new char[MAXSIZE];
        lenth = 0;
    }

    void add(char elem){
        data[lenth+1] = elem;
        lenth++;
    }

    char get(int index){return data[index];}

    /** 
     * @Description:  BF匹配算法
     * @Param:  字串
     * @return:  子串在正文串中的开始下标，没有返回-1
     * @Author: 
     * @Date:   
     */ 
    int indexBF(SString t){
        int i = 1;      //主串的下标 S
        int j = 1;      //子串的下标 T

        while (i <= lenth && j <= t.lenth){
            if (data[i] == t.data[j]){ i++;j++; }   //主串和子串一次匹配下一个字符
            else {
                i = i - j + 2;                      //主串子串回溯，重新开始下一次匹配
                j = 1;
            }
        }
        //判断是否找到 如果找到 子串的下标应该大于子串的长度   , 目标下标为 主串的下标减去子串的长度
        System.out.println(i+"--"+j);
        System.out.println(i);
        if(j > t.lenth) {return i - t.lenth;}
        else return -1;
    }

    public static void main(String[] args) {
        SString s = new SString();
        s.add('a');
        s.add('a');
        s.add('a');
        s.add('a');
        s.add('a');
        s.add('b');

        SString t = new SString();
        t.add('a');
        t.add('a');
        t.add('a');
        t.add('b');
        System.out.println(s.indexBF(t));

    }
}