package clean_code.patterns.homework.task_3;

public class Main {
    public static void main(String[] args) {

        VehicleFactory factory;
        String typeVehicle = "Bicycle";

        if ("Car".equals(typeVehicle)){
            factory = new CarFactory();
        } else {
            factory = new BicycleFactory();
        }

        factory.planeDrive();
    }
}
