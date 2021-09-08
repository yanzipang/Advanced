package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 静态常量 饿汉式
 */
public class SingletonTest01 {

    // 本类内部创建静态实例
    private static final SingletonTest01 SINGLETON = new SingletonTest01();

    // 构造器私有
    private SingletonTest01() {}

    // 对外提供获取该类实例的静态方法
    public static SingletonTest01 getInstance() {
        return SINGLETON;
    }
}
