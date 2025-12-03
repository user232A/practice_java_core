package clean_code.patterns.homework.task_10;

public class MilesToKilometerAdapter {

    private Miles miles;

    public MilesToKilometerAdapter(Miles miles) {
        this.miles = miles;
    }

    public double convertMilesPerHourToKilometerPerHour(){
        return miles.getSpeed()  * 1.609;
    }
}
