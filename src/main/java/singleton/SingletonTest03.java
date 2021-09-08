package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 懒汉式 线程不安全
 */
public class SingletonTest03 {

    // 本类内部创建静态实例
    private static SingletonTest03 SINGLETON;

    // 构造器私有
    private SingletonTest03() {}

    // 对外提供获取该类实例的静态方法--当使用该方法时，采取实例化该类对象--实现懒加载
    public static SingletonTest03 getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new SingletonTest03();
        }
        return SINGLETON;
    }
}
