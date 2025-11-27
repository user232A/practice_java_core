package mock.oop;

public class Letter extends Shipment {

    private double path;
    private double rate;

    public Letter(double path, double rate) {
        this.path = path;
        this.rate = rate;
    }

    @Override
    double calculate() {
        return path * rate;
    }
}
