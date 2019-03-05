package createpatern.singleton.lazy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 14:26
 * @Description:因为同步锁的存在导致程序速度慢
 */
public class SingletonSynchronized {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonSynchronized instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonSynchronized() {
    }

    /* 1:懒汉式，静态工程方法，创建实例 */
    public static SingletonSynchronized getInstance() {
        synchronized (SingletonSynchronized.class) {
            if (instance == null) {
                instance = new SingletonSynchronized();
            }
        }
        return instance;
    }

    /**
     * 3、对外提供获取实例的方法
     * 但是同步的时候将锁放到第一次获取实例的时候，可以防止无序写入导致的问题
     * @return
     */
    public static SingletonSynchronized getInstance1(){
        if (instance == null ) {
            SingletonSynchronized s3;
            synchronized (SingletonSynchronized.class) {
                s3 = instance;
                if (s3 == null ) {
                    synchronized (SingletonSynchronized.class) {
                        if (s3 == null ) {
                            s3 = new SingletonSynchronized();
                        }
                    }
                    instance = s3;
                }
            }
        }
        return instance;
    }
}
