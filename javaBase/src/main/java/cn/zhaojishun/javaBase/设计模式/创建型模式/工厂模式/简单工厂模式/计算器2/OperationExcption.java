package cn.zhaojishun.javaBase.设计模式.创建型模式.工厂模式.简单工厂模式.计算器2;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:53
 */
public class OperationExcption extends RuntimeException {
    OperationExcption(String name){
        super(name);
    }
}