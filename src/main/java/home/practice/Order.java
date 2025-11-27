package home.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    List<Product> products;
    List<Promotion> promotions;

    public Order() {
        this.products = new ArrayList<>();
        this.promotions = new ArrayList<>();
    }

    public void addProducts(Product ... product){
        products.addAll(Arrays.asList(product));
    }

    public void addPromo(Promotion ... promo){
        promotions.addAll(Arrays.asList(promo));
    }

    public double calculateTotalPrice(){
        double sum = products.stream().mapToDouble(Product::getPrice).sum();
        for (Promotion promo: promotions){
            sum -= promo.discount(products);
        }
        return sum;
    }
}
