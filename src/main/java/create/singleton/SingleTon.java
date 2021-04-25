package create.singleton;

/**
 * 完美单例设计模式demo
 * 使用 IoDH 形式的单例
 *
 * @author yangyang.liu
 * @date 2021-04-25 22:02
 */
public class SingleTon {

    private SingleTon() {

    }

    /**
     * IoDH
     * 通过增加一个内部静态类，在该内部类中创建单例对象，
     * 再将该单例对象通过getInstance()方法返回给外部使用
     * <p>
     * 既可以实现延迟加载，又可以保证线程安全（JVM保证安全)
     */
    private static class InstanceClass {
        private final static SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance() {
        return InstanceClass.instance;
    }

}