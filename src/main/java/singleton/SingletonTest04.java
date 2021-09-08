package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 懒汉式 线程安全 同步方法
 */
public class SingletonTest04 {

    // 本类内部创建静态实例
    private static SingletonTest04 SINGLETON;

    // 构造器私有
    private SingletonTest04() {}

    // 加锁---synchronized--同步代码块
    public static  SingletonTest04 getInstance() {
        if (SINGLETON == null) {
            synchronized (SingletonTest03.class) {
                if (SINGLETON == null) {
                    SINGLETON = new SingletonTest04();
                }
            }
        }
        return SINGLETON;
    }
}
