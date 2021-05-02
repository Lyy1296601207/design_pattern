package structure.bridge;

/**
 * @author yangyang.liu
 * @date 2021-05-02 12:04
 */
abstract class Pen {

    /**
     * 注意修饰符为protected
     */
    protected Color color;
    protected Cuxi cuxi;

    /**
     * 提供set
     */
    public void set(Color color, Cuxi cuxi) {
        this.color = color;
        this.cuxi = cuxi;
    }

    /**
     * 笔的抽象方法
     */
    public abstract void draw();
}