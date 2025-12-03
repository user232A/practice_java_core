package clean_code.patterns.homework.task_12;

public class HomeSecuritySystem implements ISmartHome{

    @Override
    public void turnOn() {
        System.out.println("Включаем систему безопасности");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключаем систему безопасности");
    }
}
