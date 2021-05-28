package structure.decorator;

/**
 * 具体装饰类——黑色边框
 *
 * @author yangyang.liu
 * @date 2021-05-28 13:09
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }

    private void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }
}