package home.coding.order_system;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products;
    private List<Discountable> discounts;

    public Order() {
        this.products = new ArrayList<>();
        this.discounts = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void addProducts(List<Product> prod){
        products.addAll(prod);
    }

    public void addDiscount(Discountable discountable){
        discounts.add(discountable);
    }

    public void addDiscounts(List<Discountable> disc){
        discounts.addAll(disc);
    }

    public double calculateTotalPrice(){
    /*    AtomicReference<Double> totalProductSum = new AtomicReference<>((double)products.stream().mapToInt(Product::getPrice).sum());
        discounts.forEach(it -> {
            totalProductSum.updateAndGet(v -> it.discount(totalProductSum.get()));
        });
     */

        double totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
        for (Discountable discountable: discounts){
            totalPrice -= discountable.discount(totalPrice);
        }
        return totalPrice;
    }
}
