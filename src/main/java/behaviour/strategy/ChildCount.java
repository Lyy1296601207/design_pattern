package behaviour.strategy;

/**
 * @author yangyang.liu
 * @date 2021-05-30 11:48
 */
public class ChildCount implements Discount {
    @Override
    public double discount(double price) {
        System.out.println("儿童票打折，立减十元：");
        return (price - 10L) > 0 ? (price - 10L) : 0;
    }
}