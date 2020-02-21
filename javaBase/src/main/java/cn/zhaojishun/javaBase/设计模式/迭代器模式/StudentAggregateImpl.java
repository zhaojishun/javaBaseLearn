package cn.zhaojishun.javaBase.设计模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 10:57
 */
public class StudentAggregateImpl implements StudentAggregate  {

    private List<Student> list;  // 学生列表

    public StudentAggregateImpl() {
        this.list = new ArrayList<Student>();
    }

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}