package structure.proxy.cdlib;

import structure.proxy.Subject;
import structure.proxy.SubjectImpl;

/**
 * @author yangyang.liu
 * @date 2021-05-04 12:27
 */
public class Test {
    public static void main(String[] args) {
        // 可以看到入参是SubjectImpl，cglib是直接代理一个类，并不要求其有接口
        Subject subject = (Subject) CgLibFactory.getProxy(SubjectImpl.class);
        subject.request();
    }
}