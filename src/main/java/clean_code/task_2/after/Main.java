package clean_code.task_2.after;

public class Main {
    public static void main(String[] args) {

        DiscountStrategy loyaltyDiscountStrategy = new LoyaltyDiscountStrategy(true, true);
        System.out.println(loyaltyDiscountStrategy.calculateFinalPrice(50));
    }
}
