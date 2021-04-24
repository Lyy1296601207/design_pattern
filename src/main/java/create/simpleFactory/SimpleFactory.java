package create.simpleFactory;

/**
 * 简单工厂类，可通过枚举类限制传参类型
 *
 * @author yangyang.liu
 * @date 2021-04-24 21:39
 */
public class SimpleFactory {

    public static Chart create(ChartEnum type) {
        Chart chart = null;
        switch (type) {
            case pie:
                chart = new Pie();
                break;
            case line:
                chart = new LineChart();
                break;
            default:
                break;
        }
        return chart;

    }


}