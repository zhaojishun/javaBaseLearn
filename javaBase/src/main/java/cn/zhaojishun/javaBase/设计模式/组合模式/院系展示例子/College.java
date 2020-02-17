package cn.zhaojishun.javaBase.设计模式.组合模式.院系展示例子;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javaBaseLearn
 * @description:Composite 学院
 * @author: Shunji Zhao
 * @create: 2020-02-17 11:38
 */
public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

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
        System.out.println("--------------" + getName() + "--------------");
//遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}