package clean_code.patterns.homework.task_10;

public class Miles implements Distance{

    private double speed;
    private double time;

    public Miles(double speed, double time) {
        this.speed = speed;
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public double getTime() {
        return time;
    }

    @Override
    public double calculatePath() {
        return speed * time;
    }
}
