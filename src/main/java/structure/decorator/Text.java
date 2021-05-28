package structure.decorator;

/**
 * @author yangyang.liu
 * @date 2021-05-28 13:05
 */
public class Text implements Component {
    @Override
    public void display() {
        System.out.println("这是一个文本框");
    }
}