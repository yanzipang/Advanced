package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @Author hgk
 * @Date 2021/9/7 19:36
 * @description 羊
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SheepOfDeepCopy implements Cloneable, Serializable {

    private static final long UID = 1L;
    private String name;
    private String color;
    private Sheep sheep;

    // 方式一：重写clone方法实现深拷贝
    @Override
    protected SheepOfDeepCopy clone() throws CloneNotSupportedException {
        SheepOfDeepCopy sheepOfDeepCopy = null;
        try {
            // 完成对基本数据类型和String类型的克隆
            sheepOfDeepCopy = (SheepOfDeepCopy) super.clone();
            // 对引用类型的属性，进行单独的处理
            // 即Sheep也要实现Cloneable接口的clone方法
            sheepOfDeepCopy.sheep = sheep.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheepOfDeepCopy;
    }

    // 用此种方式其引用类型一定要实现SerializationClone接口，否则报错
    public SheepOfDeepCopy SerializationClone() {
        // 因为要序列化，所有先创建流对象
        ByteArrayOutputStream bos;
        ObjectOutputStream oos;
        ByteArrayInputStream bis;
        ObjectInputStream ois;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 将当前对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            SheepOfDeepCopy sheepOfDeepCopy = (SheepOfDeepCopy) ois.readObject();
            return sheepOfDeepCopy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流操作
            // TODO try-with-resource
        }

    }

}
