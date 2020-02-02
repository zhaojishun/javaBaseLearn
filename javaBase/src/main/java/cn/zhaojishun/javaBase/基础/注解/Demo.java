package cn.zhaojishun.javaBase.基础.注解;

import java.lang.reflect.Field;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-01 10:02
 */
public class Demo {

    public static void main(String[] args) throws ReflectiveOperationException {
        Dog d = new Dog();
        check(d);

    }
    static void check(Dog dog) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : dog.getClass().getDeclaredFields()) {
            // 获取Field定义的@Range:
            NotNull notNull = field.getAnnotation(NotNull.class);
            // 如果@Range存在:
            if (notNull != null) {
                // 获取Field的值:person
                field.setAccessible(true);
                Object value = field.get(dog);
                String s = (String) value;
                // 判断值是否满足@Range的min/max:
                if (s.length() == 0 || s == null||s.equals("")) {
                    throw new IllegalArgumentException("Invalid field: " + field.getName());
                }

            }
        }
    }


}