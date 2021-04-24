package create.simpleFactory;

/**
 * @author yangyang.liu
 * @date 2021-04-24 21:52
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("折线图创建");
    }

    public void display() {
        System.out.println("这是折线图");
    }
}