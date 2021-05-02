package structure.bridge;

/**
 * @author yangyang.liu
 * @date 2021-05-02 12:12
 */
public class Red implements Color {
    @Override
    public void setColor() {
        System.out.println("这是红色的笔");
    }
}