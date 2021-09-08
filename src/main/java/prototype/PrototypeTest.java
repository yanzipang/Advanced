package prototype;

/**
 * @Author hgk
 * @Date 2021/9/7 19:50
 * @description
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", "白色");
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep == sheep1);    // false
        System.out.println(sheep.equals(sheep1));   // true
    }
}
