package create.factory;

/**
 * 抽象工厂，基类工厂
 *
 * @author yangyang.liu
 * @date 2021-04-24 22:19
 */
public interface Factory {
    /**
     * 注，此处只是提供了一个无参的创建方法
     * 实际业务中可以根据情况重载多个创建方法
     * 以满足不同场景
     *
     * @return Logger
     */
    Logger create();

    /**
     * <p>
     * 还有一种情况是为了简化客户端调用
     * 把Logger产品的writeLog方法直接放到工厂中
     *见下
     */
//改为抽象类
//    abstract class LoggerFactory {
//        //在工厂类中直接调用日志记录器类的业务方法writeLog()
//        public void writeLog() {
//            Logger logger = this.createLogger();
//            logger.writeLog();
//        }
//
//        public abstract Logger createLogger();
//    }
}