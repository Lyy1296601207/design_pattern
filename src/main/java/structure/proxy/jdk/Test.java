package structure.proxy.jdk;

import structure.proxy.Subject;
import structure.proxy.SubjectImpl;

/**
 * @author yangyang.liu
 * @date 2021-05-04 12:13
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = (Subject) JdkProxyFactory.getJdkProxy(new SubjectImpl());
        subject.request();
    }
}