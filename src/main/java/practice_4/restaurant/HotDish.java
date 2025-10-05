package practice_4.restaurant;

public class HotDish extends Dish {

    private double temperature;

    public HotDish(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Temperature " + this.getTemperature());
    }
}


