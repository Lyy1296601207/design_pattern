package structure.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理对象
 * 可以发现由于真实对象类型是object
 * 所以可以代理所有有共性操作的对象
 * 而不是对每个对象创建一个静态代理类
 *
 * @author yangyang.liu
 * @date 2021-05-04 12:09
 */
public class JdkInvocationHandler implements InvocationHandler {

    /**
     * 代理类中的真实对象，注意类型是object不是subject
     */
    private final Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy 代理对象
     * @param method 方法
     * @param args 参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }


    private void before() {
        System.out.println("静态代理对象方法调用前自定义操作");

    }

    private void after() {
        System.out.println("静态代理对象方法调用后自定义操作");
    }

}