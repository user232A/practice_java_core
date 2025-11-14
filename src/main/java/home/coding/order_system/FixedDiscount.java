package home.coding.order_system;

public class FixedDiscount implements Discountable{

    private int fixSum;

    public FixedDiscount(int fixSum) {
        this.fixSum = fixSum;
    }

    @Override
    public double discount(double price) {
        return fixSum;
    }
}
