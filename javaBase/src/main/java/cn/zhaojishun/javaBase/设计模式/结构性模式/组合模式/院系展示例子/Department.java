package cn.zhaojishun.javaBase.设计模式.结构性模式.组合模式.院系展示例子;

/**
 * @program: javaBaseLearn
 * @description:Leaf 叶子节点 部门
 * @author: Shunji Zhao
 * @create: 2020-02-17 11:40
 */
public class Department extends OrganizationComponent{

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}