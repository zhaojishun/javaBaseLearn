package cn.zhaojishun.javaBase.设计模式.设计原则.开闭原则;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 18:16
 */
public class Circle extends Shape {

    @Override
    void draw() {
        System.out.println(" 绘制圆形");    }
}