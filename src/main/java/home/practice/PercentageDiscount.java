package home.practice;

public class PercentageDiscount implements Discountable{

    double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discount(double price) {
        return price * percentage/100;
    }
}
