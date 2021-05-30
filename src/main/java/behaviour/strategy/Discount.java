package behaviour.strategy;

/**
 * 策略角色
 * 打折方案
 *
 * @author yangyang.liu
 * @date 2021-05-30 11:39
 */
public interface Discount {

    /**
     * 打折
     *
     * @param price 打折前价格
     * @return 打折后价格
     */
    double discount(double price);

}