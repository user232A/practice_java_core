package clean_code.patterns.homework.task_3;

public class BicycleFactory extends VehicleFactory{

    @Override
    Vehicle createVehicle() {
        return new Bicycle();
    }
}
