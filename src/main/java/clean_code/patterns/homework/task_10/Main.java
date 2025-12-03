package clean_code.patterns.homework.task_10;

public class Main {
    public static void main(String[] args) {

        Miles miles = new Miles(60, 40);
        MilesToKilometerAdapter adapter = new MilesToKilometerAdapter(miles);
        double speedKmh = adapter.convertMilesPerHourToKilometerPerHour();
        Kilometers kilometers = new Kilometers(speedKmh, 40);

        System.out.println(kilometers.calculatePath());
        System.out.println(miles.calculatePath());
    }
}
