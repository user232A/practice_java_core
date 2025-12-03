package clean_code.task_2.after;

public class LoyaltyDiscountStrategy implements DiscountStrategy {

    private boolean isLoyalCustomer;
    private boolean isFirstPurchase;

    public LoyaltyDiscountStrategy(boolean isFirstPurchase, boolean isLoyalCustomer) {
        this.isFirstPurchase = isFirstPurchase;
        this.isLoyalCustomer = isLoyalCustomer;
    }

    @Override
    public double calculateFinalPrice(double price) {
        double discount = 0.0;

        if (isLoyalCustomer) {
            if (isFirstPurchase) {
                discount = price * 0.10;
            } else {
                discount = price * 0.05;
            }
        }
        return price - discount;
    }
}
