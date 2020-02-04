package cn.zhaojishun.javaBase.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @program: javaBaseLearn
 * @description: InputStreamTest
 * @author: Shunji Zhao
 * @create: 2020-02-02 10:51
 */
public class InputStreamTest {


    public static void main(String[] args) throws IOException {


        readFile("F:\\project\\javaBaseLearn\\javaBase\\src\\main\\java\\cn\\zhaojishun\\javaBase\\IO\\text");


    }

    /**
     * @Description: 完整地读取一个FileInputStream的所有字节
     * @Param:
     * @return:
     * @Author:
     * @Date:
     */

    public static void readFile(String path) throws IOException {
        try (InputStream input = new FileInputStream("src/readme.txt")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        } // 编译器在此自动为我们写入finally并调用close()


    }
}