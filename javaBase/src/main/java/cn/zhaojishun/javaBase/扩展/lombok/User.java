package cn.zhaojishun.javaBase.扩展.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-02-21 20:04
 */
@Data // 包含@ToString@EqualsAndHashCode@Getter@Setter@RequiredArgsConstructor

/*@ToString 覆盖默认的toString()方法，将呈现类的基本信息
@EqualsAndHashCode 覆盖默认的equals和hashCode
@Getter
@Setter
@NoArgsConstructor 无参构造
@RequiredArgsConstructor 会对final和@NonNull字段生成对应参数的构造函数
@AllArgsConstructor 全参数的构造函数，会配合@NonNull
*/
@Builder
public class User {

    @NonNull
    private String name;

    private int age;

    public void testNonNull(@NonNull String name){
        this.name = name;
    }
}