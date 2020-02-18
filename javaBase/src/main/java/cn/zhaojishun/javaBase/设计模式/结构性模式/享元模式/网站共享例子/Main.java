package cn.zhaojishun.javaBase.设计模式.结构性模式.享元模式.网站共享例子;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-18 18:02
 */
public class Main {

    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website newsSite = websiteFactory.getWebSite("新闻");
        newsSite.use(new User("张三"));


        Website newsSites = websiteFactory.getWebSite("新闻");
        newsSites.use(new User("张"));

        Website newsSitess = websiteFactory.getWebSite("博客");
        newsSitess.use(new User("王五"));

        System.out.println(websiteFactory.getPoolSize());
    }
}