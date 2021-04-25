**单例模式要点**

* 某个类只能有一个实例

* 必须自行创建这个实例

* 必须自行向整个系统提供这个实例

### 饿汉、懒汉、IoDH单例
> 重点关注IoDH

**饿汉式单例**
> 定义静态变量的时候实例化单例类，因此在类加载的时候就已经创建了单例对象
```
class EagerSingleton { 
    private static final EagerSingleton instance = new EagerSingleton(); 
    private EagerSingleton() { } 
 
    public static EagerSingleton getInstance() {
        return instance; 
    }   
}
```

**懒汉式单例类与线程锁定**

[详细看此](https://blog.csdn.net/lovelion/article/details/7420886)
```
class LazySingleton { 
    // 使用volatile关键字
    private volatile static LazySingleton instance = null; 
 
    private LazySingleton() { } 
 
// 必须进行双重判断
    public static LazySingleton getInstance() { 
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance; 
    }
}
```

**二者比较**
> 饿汉式单例速度、反应时间快
> 缺点是资源利用率低，加载时间长

> 懒汉单例利用率好，缺点必须处理好线程关系
> 系统性能受到影响

**IoDH**
> 综合了上述优点
> 是最好的单例设计模式