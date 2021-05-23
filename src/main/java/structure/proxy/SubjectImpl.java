package structure.proxy;

/**
 * 实现类，被代理的真实对象（RealSubject）
 *
 * @author yangyang.liu
 * @date 2021-05-04 12:02
 */
public class SubjectImpl implements Subject {
    @Override
    public void request() {

        System.out.println("这是实现类中的输出");

    }
}