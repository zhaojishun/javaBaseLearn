package cn.zhaojishun.javaBase.设计模式.设计原则.依赖倒转原则.应用示例;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-07 10:40
 */
public class NetEaseEmail implements Email {
    @Override
    public String getInfo() {
        return "网易消息";
    }
}