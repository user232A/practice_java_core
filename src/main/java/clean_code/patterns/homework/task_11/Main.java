package clean_code.patterns.homework.task_11;

public class Main {
    public static void main(String[] args) {

        DoorFacade facade = new DoorFacade();

        facade.doorOperation(new DoorOpen());
        facade.doorOperation(new DoorClose());
        facade.doorOperation(new DoorLock());
    }
}
