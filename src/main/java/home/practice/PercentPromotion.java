package home.practice;

import java.util.List;

public class PercentPromotion implements Promotion{

    private double percent;

    public PercentPromotion(double percent) {
        this.percent = percent;
    }

    @Override
    public double discount(List<Product> list) {
        double sum = list.stream().mapToDouble(Product::getPrice).sum();
        return sum * (percent / 100);
    }
}
