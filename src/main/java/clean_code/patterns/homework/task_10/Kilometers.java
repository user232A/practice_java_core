package clean_code.patterns.homework.task_10;

public class Kilometers implements Distance{

    private double speed;
    private double time;

    public Kilometers(double speed, double time) {
        this.speed = speed;
        this.time = time;
    }

    @Override
    public double calculatePath() {
        return speed * time;
    }
}
