package structure.proxy.cdlib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yangyang.liu
 * @date 2021-05-04 12:22
 */
public class CgLibMethodInterceptor implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method " + method.getName());
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after method " + method.getName());
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