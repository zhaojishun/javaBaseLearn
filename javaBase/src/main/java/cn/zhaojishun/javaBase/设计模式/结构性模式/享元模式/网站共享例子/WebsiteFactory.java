package cn.zhaojishun.javaBase.设计模式.结构性模式.享元模式.网站共享例子;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-18 17:55
 */
public class WebsiteFactory {

    //维护共享的网站
    HashMap<String,Website> pool = new HashMap<>();

    //根据网站类型反返回网站
    public Website getWebSite(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    //获得池中数量
    public int getPoolSize(){
        return pool.size();
    }



}