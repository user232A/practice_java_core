package clean_code.patterns.homework.task_11;

public class DoorFacade {
    public void doorOperation(DoorOperation action){
        action.operation();
    }
}
