package create.singleton;

/**
 * 双重检验锁方式实现单例
 *
 * @author yangyang.liu
 * @date 2021-05-05 15:15
 */
public class DoubleLockSingleton {

    /**
     * volatile关键字保证代码执行顺序和变量可见性
     */
    private volatile static DoubleLockSingleton singleton = null;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (singleton == null) {
            // 判断为null后，给类加锁，进行第二次判断
            synchronized (DoubleLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }

}