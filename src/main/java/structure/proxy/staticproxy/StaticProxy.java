package structure.proxy.staticproxy;

import structure.proxy.Subject;

/**
 * 静态代理对象示例
 *
 * @author yangyang.liu
 * @date 2021-05-04 12:04
 */
public class StaticProxy implements Subject {

    private final Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("静态代理对象方法调用前自定义操作");

    }

    private void after() {
        System.out.println("静态代理对象方法调用后自定义操作");
    }

}