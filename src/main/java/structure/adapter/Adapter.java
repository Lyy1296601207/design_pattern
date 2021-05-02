package structure.adapter;

/**
 * 适配器类
 *
 * @author yangyang.liu
 * @date 2021-05-02 11:02
 */
public class Adapter implements Target {

    /**
     * 对象适配器模式
     */
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.someOperation();
    }
}