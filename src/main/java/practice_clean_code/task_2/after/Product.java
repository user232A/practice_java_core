package practice_clean_code.task_2.after;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private boolean isInStock;

    public Product(String name, double price, int quantity, boolean isInStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isInStock = isInStock;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isInStock() {
        return isInStock;
    }
}
