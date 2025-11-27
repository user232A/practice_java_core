package practice_clean_code.task_2.after;

import java.util.List;

public class Order {

    private List<Product> productList;
    private String customer;
    private boolean isPaid;
    private double totalPrice;

    public Order(List<Product> productList, boolean isPaid, String customer) {
        this.productList = productList;
        this.isPaid = isPaid;
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void makePayment(){
        this.isPaid = true;
    }

    public double calculateTotalPrice(){
        return productList.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity()).sum();
    }

    public void printProduct(){
        System.out.println("Order: " + this);
        System.out.println();
        productList.forEach(product -> System.out.println("Product: " + product.getName()));
    }
}
