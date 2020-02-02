package cn.zhaojishun.javaBase.基础.异常处理;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-01 09:52
 */
public class Demo {

    public static void main(String[] args) {
        String m = "";
        if(m.equals("")) throw new MyException("参数为空");
    }
}