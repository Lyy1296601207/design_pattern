package structure.bridge;

/**
 * @author yangyang.liu
 * @date 2021-05-02 12:19
 */
public class PenBuilder {
    private Color color;
    private Cuxi cuxi;
    private String drawType;


    public PenBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public PenBuilder withCuxi(Cuxi cuxi) {
        this.cuxi = cuxi;
        return this;
    }

    public PenBuilder withDarwType(String drawType) {
        this.drawType = drawType;
        return this;
    }

    public Pen build() {
        Pen pen = null;
        if ("circle".equals(this.drawType)) {
            pen = new DrawCircle();
        } else if ("aroud".equals(this.drawType)) {
            pen = new DrawAround();
        }
        pen.set(this.color, this.cuxi);
        return pen;
    }
}