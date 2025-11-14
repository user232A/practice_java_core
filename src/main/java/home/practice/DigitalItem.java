package home.practice;

public class DigitalItem extends Item{

    private double size;

    public DigitalItem(String title, double price, double size) {
        super(title, price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
