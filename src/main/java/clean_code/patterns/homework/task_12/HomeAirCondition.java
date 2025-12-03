package clean_code.patterns.homework.task_12;

public class HomeAirCondition implements ISmartHome{

    @Override
    public void turnOn() {
        System.out.println("Включаем кондиционер");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключаем кондиционер");
    }
}
