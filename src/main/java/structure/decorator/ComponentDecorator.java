package structure.decorator;

/**
 * 抽象装饰类
 *
 * @author yangyang.liu
 * @date 2021-05-28 13:06
 */
abstract class ComponentDecorator implements Component {
    /**
     * 维持抽象构件引用
     */
    protected Component component;

    public ComponentDecorator(Component component) {
        // 提供注入方法
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}