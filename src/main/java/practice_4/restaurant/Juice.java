package practice_4.restaurant;

public class Juice extends Dish {

    private double volume;

    public Juice(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Volume " + this.getVolume());
    }
}
