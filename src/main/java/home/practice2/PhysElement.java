package home.practice2;

public class PhysElement extends Element{

    private double weight;

    public PhysElement(String name, int price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
