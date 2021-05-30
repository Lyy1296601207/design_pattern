package behaviour.strategy;

/**
 * 模拟context角色
 * 票的价格
 *
 * @author yangyang.liu
 * @date 2021-05-30 11:38
 */
public class TicketPrice {

    private double price;
    private double countPrice;

    /**
     * 维持一个策略引用
     */
    private Discount discount;


    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public Discount getDiscount() {
        return discount;
    }


    public double getCountPrice() {
        return countPrice;
    }

    public void count() {
        countPrice = discount.discount(price);
    }
}