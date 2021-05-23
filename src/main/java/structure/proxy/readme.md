**代理模式**
> 给某一个对象提供一个代理或占位符，并由代理对象来控制对原对象的访问

**角色**
* subject 抽象主题
> 真实主题和代理主题的共同接口

* proxy 代理角色
> 包含了对真实主题的引用，从而可以在任何时候操作真实主题对象

* realSubject 真实主题
> 定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作

**分类**
* 静态代理
> 对目标对象的每个方法的增强都是手动完成的
> 在编译时就将接口、实现类、代理类这些都变成了一个个实际的 class 文件
> 日常开发中几乎不用

* 动态代理
> 在运行时动态生成类字节码，并加载到 JVM 中
>
> 分类
> * JDK动态代理
> InvocationHandler 接口和 Proxy 类是核心
>
> * cglib动态代理
> MethodInterceptor 接口和 Enhancer 类是核心
>
> * 二者区别
> 1. JDK 动态代理只能只能代理实现了接口的类或者直接代理接口，而 CGLIB 可以代理未实现任何接口的类
> 2. CGLIB 动态代理是通过生成一个被代理类的子类来拦截被代理类的方法调用，因此不能代理声明为 final 类型的类和方法
> 3. JDK代理性能更优秀