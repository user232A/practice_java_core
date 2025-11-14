package home.practice;

public class FixedDiscount implements Discountable{

    double fixSum;

    public FixedDiscount(double fixSum) {
        this.fixSum = fixSum;
    }

    @Override
    public double discount(double price) {
        return fixSum;
    }
}
