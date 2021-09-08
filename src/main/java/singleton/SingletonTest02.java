package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 静态代码块 饿汉式
 */
public class SingletonTest02 {

    // 本类内部创建静态实例
    private static final SingletonTest02 SINGLETON;

    // 静态代码块
    static {
        SINGLETON = new SingletonTest02();
    }

    // 构造器私有
    private SingletonTest02() {}

    // 对外提供获取该类实例的静态方法
    public static SingletonTest02 getInstance() {
        return SINGLETON;
    }
}
