package practice_zero;

public class Product {

    String name;
    double price;

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

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount){
        double temp = (price * discount) / 100;
        this.setPrice(price - temp);
    }

    public void printInfo(){
        System.out.println("practice_zero.Product " + this.getName() + " Price " + this.getPrice());
    }
}
