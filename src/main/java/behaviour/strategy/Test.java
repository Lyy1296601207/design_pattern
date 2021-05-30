package behaviour.strategy;

/**
 * @author yangyang.liu
 * @date 2021-05-30 11:50
 */
public class Test {
    public static void main(String[] args) {
        TicketPrice ticketPrice = new TicketPrice();
        ticketPrice.setPrice(40L);
        System.out.println("原价："+ ticketPrice.getPrice());

        ticketPrice.setDiscount(new StudentCount());
        ticketPrice.count();
        System.out.println(ticketPrice.getCountPrice());

        ticketPrice.setDiscount(new ChildCount());
        ticketPrice.count();
        System.out.println(ticketPrice.getCountPrice());

    }
}