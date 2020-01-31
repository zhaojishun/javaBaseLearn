package cn.zhaojishun;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

/**
 * @Title: Test
 * @ProjectName javaBaseLearn
 * @Description: TODO
 * @author 顺
 * @date 2020/1/2916:53
 */

public class Test {
    List list = new ArrayList();

    /** 
     * @Description:
     * @Param:  
     * @return:  
     * @Author: 
     * @Date:   
     */
    public static void main(String[] args) {
        Boolean flag = true;
        System.out.println(flag);
        System.out.println(flag);
        System.out.println(flag);
        print(flag);


    }

    private static void print(Boolean flag) {
        System.out.println(flag+"1");
        System.out.println(flag+"1");
        System.out.println(flag+"1");
    }

}