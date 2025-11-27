package home.practice2;

public class DigitalElement extends Element{

    private double file;

    public DigitalElement(String name, int price, double file) {
        super(name, price);
        this.file = file;
    }

    public double getFile() {
        return file;
    }
}
