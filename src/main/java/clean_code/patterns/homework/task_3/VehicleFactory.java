package clean_code.patterns.homework.task_3;

abstract class VehicleFactory {
    abstract Vehicle createVehicle();

    public void planeDrive(){
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
