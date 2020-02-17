package cn.zhaojishun.javaBase.设计模式.组合模式.院系展示例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-17 11:46
 */
public class Main {

    public static void main(String[] args) {
        //创建大学
        OrganizationComponent university = new University("清华大学", "NO1");
        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent InfoCollege = new College("信息工程院", "信息工程院");

        //创建专业
        computerCollege.add(new Department("网络工程","还可以"));
        computerCollege.add(new Department("计算机科学与技术","还可以"));

        InfoCollege.add(new Department("信息工程","还可以"));
        InfoCollege.add(new Department("通信工程","还可以"));

        //将学院添加到大学中
        university.add(computerCollege);
        university.add(InfoCollege);

        university.print();

    }
}