package cn.zhaojishun.javaBase.基础.异常处理;

/**
 * @program: javaBaseLearn
 * @description: 异常处理
 * @author: Shunji Zhao
 * @create: 2020-02-01 09:47
 */
public class MyException extends RuntimeException{


    MyException(){
        super();
    }

    MyException(String msg){
        super(msg);
    }

}