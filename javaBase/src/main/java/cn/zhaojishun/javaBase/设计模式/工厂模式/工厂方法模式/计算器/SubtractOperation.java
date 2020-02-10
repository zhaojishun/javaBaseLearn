package cn.zhaojishun.javaBase.设计模式.工厂模式.工厂方法模式.计算器;

import cn.zhaojishun.javaBase.设计模式.工厂模式.工厂方法模式.计算器.Operation;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 10:49
 */
public class SubtractOperation implements Operation{

    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}