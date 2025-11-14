package home.practice;

public class PhysicalItem extends Item{

    private double weight;

    public PhysicalItem(String title, double price, double weight) {
        super(title, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
