package structure.proxy.staticproxy;

import structure.proxy.SubjectImpl;

/**
 * @author yangyang.liu
 * @date 2021-05-04 12:06
 */
public class Test {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new SubjectImpl());
        staticProxy.request();
    }
}