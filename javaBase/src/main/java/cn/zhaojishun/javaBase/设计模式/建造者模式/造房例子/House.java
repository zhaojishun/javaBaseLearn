package cn.zhaojishun.javaBase.设计模式.建造者模式.造房例子;

/**
 * @program: javaBaseLearn
 * @description:产品> Product
 * @author: Shunji Zhao
 * @create: 2020-02-12 10:51
 */
public class House {
    /**
    * 地基
    */
    private String baise;
    
    /**
    *墙体
    */
    private String wall;
    
    /**
    *屋顶
    */
    private String roofed;

    @Override
    public String toString() {
        return "House{" +
                "baise='" + baise + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}