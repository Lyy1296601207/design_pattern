package behaviour.strategy;

/**
 * @author yangyang.liu
 * @date 2021-05-30 11:47
 */
public class StudentCount implements Discount {
    @Override
    public double discount(double price) {
        System.out.println("学生票打折，系数*0.8");
        return price * 0.8;
    }
}