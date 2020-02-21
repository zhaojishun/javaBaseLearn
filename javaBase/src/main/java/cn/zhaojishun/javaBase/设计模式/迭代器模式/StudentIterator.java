package cn.zhaojishun.javaBase.设计模式.迭代器模式;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 10:57
 */
public interface  StudentIterator {
    boolean hashNext();
    Student next();
}