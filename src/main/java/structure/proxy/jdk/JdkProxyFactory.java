package structure.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author yangyang.liu
 * @date 2021-05-04 12:12
 */
public class JdkProxyFactory {

    public static Object getJdkProxy(Object target) {
        // 使用Proxy.newProxyInstance生成代理对象
        // 关注其参数
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new JdkInvocationHandler(target)
        );
    }

}