package clean_code.patterns.homework.task_3;

public class CarFactory extends VehicleFactory{

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
