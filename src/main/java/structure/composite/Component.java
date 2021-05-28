package structure.composite;

/**
 * 容器抽象
 * 此为透明组合模式：所有方法在抽象中均可看到
 * 好处是方便客户端调用，坏处是可能因操作不当抛异常
 * <p>
 * 另外还有安全组合模式：抽象中只提供公共的方法，具体组件方法放到各自组件类中
 * 好处是足够安全，坏处是不方便调用
 *
 * @author yangyang.liu
 * @date 2021-05-28 12:12
 */
abstract class Component {

    /**
     * 组件名称，可以放到抽象中
     * 也可以放到具体的组件中
     */
    protected String componentName;

    /**
     * 添加成员
     *
     * @param component c
     */
    public abstract void add(Component component) throws Exception;

    /**
     * 移除成员
     *
     * @param component c
     */
    public abstract void remove(Component component) throws Exception;

    /**
     * 获取子成员
     *
     * @param i int
     * @return c
     */
    public abstract Component getChild(int i) throws Exception;

    /**
     * 操作
     */
    public abstract void operation();

}