package structure.bridge;

/**
 * @author yangyang.liu
 * @date 2021-05-02 12:10
 */
public class DrawCircle extends Pen {

    @Override
    public void draw() {
        color.setColor();
        cuxi.setCuxi();
        System.out.println("这支笔画了一个圆形");
    }
}