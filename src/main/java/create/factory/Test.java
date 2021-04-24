package create.factory;

/**
 * @author yangyang.liu
 * @date 2021-04-24 22:23
 */
public class Test {
    public static void main(String[] args) {
        Logger logger;
        Factory factory;


        factory = new FileLoggerFactory();
        logger = factory.create();
        // 若想要工厂也可以根据配置灵活变动
        // 可使用以下代码创建工厂
        // cName 为工厂类名
        //  Class c=Class.forName(cName);
        //    Object obj=c.newInstance();
        //   return obj;
        
        logger.writeLog();
    }
}