package mock.oop;

public class Package extends Shipment {

    private double path;
    private double rate;

    public Package(double path, double rate) {
        this.path = path;
        this.rate = rate;
    }

    @Override
    double calculate() {
        return path * rate + 100;
    }
}
