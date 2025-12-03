package clean_code.patterns.homework.task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    private double discount;
    private String paymentMethod;
    private List<Product> productList;

    public Order(double discount, String paymentMethod) {
        this.discount = discount;
        this.paymentMethod = paymentMethod;
        this.productList = new ArrayList<>();
    }

    public Order(OrderBuilder orderBuilder) {
        this.discount = orderBuilder.discount;
        this.paymentMethod = orderBuilder.paymentMethod;
        this.productList = new ArrayList<>(orderBuilder.productList);
    }

    public void addProductToList(Product... products) {
        productList.addAll(Arrays.asList(products));
    }

    public double totalPrice() {
        double sum = 0;
        if (!productList.isEmpty()) {
            sum = productList.stream().mapToDouble(product -> product.getPrice() - discount).sum();
        }
        return sum;
    }

    public void printInfo() {
        System.out.println("Order: " + this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", productList=" + productList +
                '}';
    }

    static class OrderBuilder {

        private double discount;
        private String paymentMethod;
        private List<Product> productList = new ArrayList<>();

        public OrderBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder setPaymentMethod(String method) {
            this.paymentMethod = method;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
