package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 静态内部类
 */

/**
 * 静态内部类有两个特点：
 *      1、当外部类被装载的时候，静态内部类并不会别装载
 *      2、调用getInstance()时静态内部类才会被装载(JVM在装载类的时候是线程安全的)
 */
public class SingletonTest06 {


    // 构造器私有
    private SingletonTest06() {}

    // 静态内部类
    private static class SingletonInstance {
        private static final SingletonTest06 SINGLETON = new SingletonTest06();

    }

    public static SingletonTest06 getInstance() {
        return SingletonInstance.SINGLETON;
    }
}
