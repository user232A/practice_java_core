package clean_code.task_2.after;

public class DiscountCalculator {

    public double calculateLoyaltyProgram(double price, boolean isLoyalCustomer, boolean isFirstPurchase){
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

    public double calculateCouponProgram(double price, boolean hasCoupon){
        double discount = 0.0;

        if (hasCoupon) {
            discount = price * 0.07;
        } else {
            discount = price * 0.02;
        }
        return price - discount;
    }
}
