package create.factory;

/**
 * 具体产品：文件渠道日志记录器
 *
 * @author yangyang.liu
 * @date 2021-04-24 22:17
 */
public class FileLogger implements Logger {
    public FileLogger() {
        System.out.println("文件日志记录器构造函数，进行了一些初始化操作");
    }

    @Override
    public void writeLog() {
        System.out.println("这是文件渠道日志记录器输出内容");
    }
}