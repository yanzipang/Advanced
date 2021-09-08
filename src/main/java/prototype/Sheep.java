package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author hgk
 * @Date 2021/9/7 19:36
 * @description 羊
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable, Serializable {
    private String name;
    private String color;

    // 实现Cloneable接口的clone方法
    // 克隆该实例，就用默认的方法克隆
    // 这里是浅拷贝
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
