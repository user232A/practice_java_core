package home.practice;

import java.util.List;

public class FixedAmountPromotion implements Promotion{

    private double fixSum;

    public FixedAmountPromotion(double fixSum) {
        this.fixSum = fixSum;
    }

    @Override
    public double discount(List<Product> list) {
        return fixSum;
    }
}
