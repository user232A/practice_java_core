package home.practice2;

public class FixedDiscount implements Discountable{
    private double fixedSum;

    public FixedDiscount(double fixedSum) {
        this.fixedSum = fixedSum;
    }

    @Override
    public double discount(double sum) {
        return fixedSum;
    }
}
