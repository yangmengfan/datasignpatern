package createpatern.singleton.lazy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 14:22
 * @Description: 此单例模式线程不安全，在多线程中很容易出现不同步的情况，如在数据库对象进行的频繁读写操作时。
 *               可通过加同步锁解决 SingletonSynchronized
 */
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 1:懒汉式，静态工程方法，创建实例 */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
