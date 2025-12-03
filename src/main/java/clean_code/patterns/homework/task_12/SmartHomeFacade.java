package clean_code.patterns.homework.task_12;

public class SmartHomeFacade {

    public void systemOn(ISmartHome smartHome){
        smartHome.turnOn();
    }

    public void systemOff(ISmartHome smartHome){
        smartHome.turnOff();
    }
}
