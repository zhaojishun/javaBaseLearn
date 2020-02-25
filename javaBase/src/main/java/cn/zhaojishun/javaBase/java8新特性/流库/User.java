package cn.zhaojishun.javaBase.java8新特性.流库;

import lombok.Builder;
import lombok.Data;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-23 09:46
 */
@Data
@Builder
public class User {

    private Integer id;

    private String name;
    
    private int age;
}