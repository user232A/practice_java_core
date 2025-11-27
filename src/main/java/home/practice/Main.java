package home.practice;

public class Main {

    /*

    Product (name, price, category)

    Promotion
    percentPromotion
    fixedAmountPromotion
    Coupon

    Order
    sumPurchase
    totalSum

     */

    public static void main(String[] args) {

        Order order = new Order();

        Product product1 = new Product("char", 45, new Category("A"));
        Product product2 = new Product("table", 55, new Category("B"));
        Product product3 = new Product("window", 60, new Category("A"));
        Product product4 = new Product("window", 100, new Category("A"));

        order.addProducts(product1, product2, product3, product4);

        order.addPromo(
                new PercentPromotion(10),
                new FixedAmountPromotion(20),
                new Coupon(5, new Category("A"))
        );

        System.out.println(order.calculateTotalPrice());
    }
}
