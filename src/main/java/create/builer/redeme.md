**建造者模式**
> 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

**角色**
* builder 抽象建造者
> 为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法，一类方法是buildPartX()，它们用于创建复杂对象的各个部件；另一类方法是getResult()，它们用于返回复杂对象

* concreteBuilder 具体建造者
> 实现builder，实现各个部位具体构造和装配方法，明确其所创建的对象

* product 产品角色
> 被创建的复杂对象，包含多个部件，concreteBuilder创建其内部表示，定义其装配过程

* director 导演类、指挥者
> 安排对象的建造次序，与builder存在关联关系，客户端使用director

