package cn.zhaojishun.javaBase.基础.配置文件读取;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-10 12:02
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(readProperty("dbtype"));
    }

    //读取配置文件
    private static String readProperty(String key) {
        String drivers = null;
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath()));
            drivers = prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drivers;
    }
}