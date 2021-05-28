package structure.decorator;

/**
 * 具体构件——窗体
 *
 * @author yangyang.liu
 * @date 2021-05-28 13:04
 */
public class Window implements Component {
    @Override
    public void display() {
        System.out.println("这是一个窗体");
    }
}