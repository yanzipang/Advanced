package singleton;

/**
 * @Author hgk
 * @Date 2021/9/6 20:46
 * @description 静态内部类
 */

/**
 *
 */
public enum  SingletonTest07 {
    INSTANCE;
    public void method() {
        System.out.println("这是一个方法");
    }
}

// 测试类
class TestDemo {
    public static void main(String[] args) {
        // 获取单例实例对象
        SingletonTest07 instance = SingletonTest07.INSTANCE;
        instance.method();
    }
}
