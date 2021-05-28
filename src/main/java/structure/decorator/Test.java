package structure.decorator;

/**
 * @author yangyang.liu
 * @date 2021-05-28 13:10
 */
public class Test {
    public static void main(String[] args) {
        Component window,text;

        window = new Window();
        text = new Text();

        // 单次装饰
        Component bar = new ScrollBarDecorator(window);
        // 多次装饰
        Component testText = new BlackBorderDecorator(new ScrollBarDecorator(text));

        bar.display();
        testText.display();

    }
}