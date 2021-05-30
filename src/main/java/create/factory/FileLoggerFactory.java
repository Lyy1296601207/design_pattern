package create.factory;

import create.singleton.DoubleLockSingleton;

/**
 * 文件日志记录创建工厂
 * 此处是工厂和单例结合
 *
 * @author yangyang.liu
 * @date 2021-04-24 22:19
 */
public class FileLoggerFactory implements Factory {
    @Override
    public Logger create() {
        //创建文件日志记录器对象
        //创建文件等其它操作
        return new FileLogger();
    }

    private FileLoggerFactory() {
    }

    private volatile static FileLoggerFactory factory;

    public static FileLoggerFactory getInstance() {
        if (factory == null) {
            // 判断为null后，给类加锁，进行第二次判断
            synchronized (DoubleLockSingleton.class) {
                if (factory == null) {
                    factory = new FileLoggerFactory();
                }
            }
        }
        return factory;
    }
}