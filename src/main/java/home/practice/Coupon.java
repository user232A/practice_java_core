package home.practice;

import java.util.List;

public class Coupon implements Promotion{

    private double couponSum;
    private Category category;

    public Coupon(double couponSum, Category category) {
        this.couponSum = couponSum;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public double discount(List<Product> list) {
        double sum = 0;
        for (Product product: list){
            if (product.getCategory().getName().equals(category.getName())){
                sum += couponSum;
            }
        }
        return sum;
    }
}
