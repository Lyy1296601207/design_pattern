package create.factory;

/**
 * 文件日志记录创建工厂
 *
 * @author yangyang.liu
 * @date 2021-04-24 22:19
 */
public class FileLoggerFactory implements Factory {
    @Override
    public Logger create() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件等其它操作
        return logger;
    }
}