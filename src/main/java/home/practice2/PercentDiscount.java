package home.practice2;

public class PercentDiscount implements Discountable{

    private double percent;

    public PercentDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double discount(double sum) {
        return sum * percent/100;
    }
}
