package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 懒汉式 线程安全 双重锁机制
 */
public class SingletonTest05 {

    // 本类内部创建静态实例
    // volatile--保证可见性--即一个线程改变了值，另一个线程可以立马感知到改变的值
    private static volatile SingletonTest05 SINGLETON;

    // 构造器私有
    private SingletonTest05() {}

    public static SingletonTest05 getInstance() {
        if (SINGLETON == null) {
            synchronized (SingletonTest03.class) {
                if (SINGLETON == null) {
                    SINGLETON = new SingletonTest05();
                }
            }
        }
        return SINGLETON;
    }
}
