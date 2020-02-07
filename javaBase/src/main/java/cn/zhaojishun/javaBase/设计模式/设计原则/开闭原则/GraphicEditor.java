package cn.zhaojishun.javaBase.设计模式.设计原则.开闭原则;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 18:17
 */
public class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }
}