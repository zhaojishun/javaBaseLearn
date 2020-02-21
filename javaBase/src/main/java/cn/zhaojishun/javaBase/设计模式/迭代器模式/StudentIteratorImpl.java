package cn.zhaojishun.javaBase.设计模式.迭代器模式;

import java.util.List;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 10:58
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;
    private Student currentStudent;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hashNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}