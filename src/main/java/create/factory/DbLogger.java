package create.factory;

/**
 * 具体产品：数据库日志记录器
 *
 * @author yangyang.liu
 * @date 2021-04-24 22:17
 */
public class DbLogger implements Logger {
    public DbLogger() {
        System.out.println("数据库日志记录器构造函数，进行了一些初始化操作");
    }

    @Override
    public void writeLog() {
        System.out.println("这是数据库日志记录器输出内容");
    }
}