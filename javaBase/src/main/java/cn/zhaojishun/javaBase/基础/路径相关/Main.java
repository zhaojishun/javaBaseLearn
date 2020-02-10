package cn.zhaojishun.javaBase.基础.路径相关;

import java.io.File;
import java.io.IOException;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 12:15
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //获取当前工程resources目录下文件的路径
        String t=Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();
        System.out.println(t);
        String fileName = Main.class.getClassLoader().getResource("").getPath();
        System.out.println(fileName);
        //获取当前类所在工程的路径
        String property =System.getProperty("/");
        System.out.println(property);
        //获得包名
        System.out.println(Main.class.getPackage().getName());

    }
}