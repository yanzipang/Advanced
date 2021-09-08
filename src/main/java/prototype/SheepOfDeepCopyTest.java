package prototype;

/**
 * @Author hgk
 * @Date 2021/9/7 20:23
 * @description
 */
public class SheepOfDeepCopyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", "白色");
        SheepOfDeepCopy sheepOfDeepCopy = new SheepOfDeepCopy("zjl", "粉色", sheep);

        SheepOfDeepCopy sheepOfDeepCopy1 = sheepOfDeepCopy.SerializationClone();

        System.out.println(sheepOfDeepCopy == sheepOfDeepCopy1);    // false
        System.out.println(sheepOfDeepCopy.equals(sheepOfDeepCopy1));   // true

        System.out.println(sheepOfDeepCopy.getSheep() == sheepOfDeepCopy1.getSheep());  // false
        System.out.println(sheepOfDeepCopy.getSheep().equals(sheepOfDeepCopy1.getSheep()));  // true
    }
}
