package clean_code.patterns.homework.task_12;

public class HomeLight implements ISmartHome{

    @Override
    public void turnOn() {
        System.out.println("Включаем свет");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключаем свет");
    }
}
