package structure.bridge;

/**
 * @author yangyang.liu
 * @date 2021-05-02 12:13
 */
public class DrawAround extends Pen {
    @Override
    public void draw() {
        color.setColor();
        cuxi.setCuxi();
        System.out.println("这支笔画了一个矩形");
    }
}