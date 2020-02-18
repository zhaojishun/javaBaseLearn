package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.简单工厂模式.计算器;

/**
 * @program: javaBaseLearn
 * @description: 入口
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:30
 */
public class MainDemo {

    //计算器
    public static void main(String[] args) {
        int a = 45;
        int b = 20;
        String operator = "*";
        System.out.println(calculate(a, b, operator));
    }

    /*此种方法不宜与扩展，每次添加运算符都需要改源代码 ，没有数值判断*/
    static int calculate (int a , int b , String operator){
        int reslut = 0;
        switch (operator){
            case "+" :
                reslut = a+b;
                break;
            case "-" :
                reslut = a-b;
                break;
            case "*":
                reslut = a*b;
                break;
            case "/":
                reslut = a/b;
                break;
        }
        return reslut;
    }

}