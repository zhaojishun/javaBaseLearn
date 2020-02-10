package cn.zhaojishun.javaBase.设计模式.工厂模式.简单工厂模式.计算器2;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:54
 */
public class OperationFactory {

    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate) {
            case "+":
                operation =  new AddOperation();
                break;
            case "-":
                operation =  new SubtractOperation();
                break;
            case "*":
                operation =  new MultiplyOperation();
                break;
            case "/":
                operation =  new DivisionOperation();
                break;
                default:
                    new OperationExcption("运算符不匹配");
        }
        return operation;
    }
}