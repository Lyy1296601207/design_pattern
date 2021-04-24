package create.simpleFactory;

/**
 * @author yangyang.liu
 * @date 2021-04-24 21:55
 */
public class Test {

    public static void main(String[] args) {

        Chart chart1 = SimpleFactory.create(ChartEnum.pie);
        Chart chart2 = SimpleFactory.create(ChartEnum.line);

        chart1.display();
        chart2.display();
    }
}