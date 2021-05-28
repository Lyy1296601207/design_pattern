package structure.decorator;

/**
 * 具体装饰类——增加滚动条
 *
 * @author yangyang.liu
 * @date 2021-05-28 13:08
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setScrollBar();
    }

    private void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }

}