package structure.proxy.cdlib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author yangyang.liu
 * @date 2021-05-04 12:27
 */
public class CgLibFactory {

    public static Object getProxy(Class<?> clazz) {
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new CgLibMethodInterceptor());
        // 创建代理类
        return enhancer.create();
    }

}