package create.factory;

/**
 * 数据库日志记录创建工厂
 *
 * @author yangyang.liu
 * @date 2021-04-24 22:19
 */
public class DbLoggerFactory implements Factory {
    @Override
    public Logger create() {
        //连接数据库等操作
        //创建数据库日志记录器对象
        //初始化数据库日志记录器，代码省略
        return new DbLogger();
    }
}