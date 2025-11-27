package mock.oop;

public class Fragile extends Shipment {

    private double path;
    private double rate;

    public Fragile(double path, double rate) {
        this.path = path;
        this.rate = rate;
    }

    @Override
    double calculate() {
        return path * rate + 50;
    }
}
