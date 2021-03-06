**桥接模式**
> 将抽象部分与实现部分分离，使之可以独立变化
> 又称柄体模式或接口模式

**个人理解**
> 本质上是体现对象多维度的变化，每个维度变化单独维护，多维度在抽象层统一进行关联组合
> 比如对一支笔，其粗细、颜色都是维度
> 对笔的抽象过程体现在下述角色中

**角色**
* abstraction 抽象类
> 对象抽象层与实现层的关联关系维护类，提供set方法set维度
> 如对笔的抽象，里面维护了粗细、颜色的对象——关联关系维护
> 此外还定义了毛笔的一些抽象方法——比如写、画

* refinedAbstraction 扩充抽象类
> 扩充abstraction，不再是抽象类而是具体类，实现抽象类中定义的方法
> 由于abstraction维护了关联关系，所以它也可以调用其它维度

* implementor 实现类接口
> 其实就是维度接口，对维度的描述

* concreteImplementor 具体实现类
> 对维度的具体描述

**扩展**
* 桥接模式与适配器模式联用
> 体现在concreteImplementor层，添加适配器