package structure.bridge;

import java.util.Arrays;

/**
 * @author yangyang.liu
 * @date 2021-05-02 12:14
 */
public class Test {
    public static void main(String[] args) {
        // 抽象笔及其维度定义
        Pen pen1 = new DrawCircle();
        Pen pen2 = new DrawAround();
        Color red = new Red();
        Color green = new Green();
        Cuxi cu = new Cu();
        Cuxi xi = new Xi();

        // set笔的各个维度
        pen1.set(red, cu);
        pen2.set(green, xi);

        // 调用抽象方法
        pen1.draw();
        pen2.draw();

        // 桥接与建造者模式结合
        Pen pen3 = new PenBuilder()
                .withDarwType("circle")
                .withColor(new Red())
                .withCuxi(new Xi())
                .build();

        pen3.draw();
    }
}