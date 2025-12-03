package clean_code.task_2.after;

public class CouponDiscountStrategy implements DiscountStrategy {

    private boolean hasCoupon;

    public CouponDiscountStrategy(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    @Override
    public double calculateFinalPrice(double price) {
        double discount = 0.0;

        if (hasCoupon) {
            discount = price * 0.07;
        } else {
            discount = price * 0.02;
        }
        return price - discount;
    }
}
