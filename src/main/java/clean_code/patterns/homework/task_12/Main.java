package clean_code.patterns.homework.task_12;

public class Main {
    public static void main(String[] args) {

        SmartHomeFacade facade = new SmartHomeFacade();

        facade.systemOn(new HomeLight());
        facade.systemOn(new HomeAirCondition());
        facade.systemOn(new HomeSecuritySystem());
        System.out.println();

        facade.systemOff(new HomeAirCondition());
        facade.systemOff(new HomeLight());
        facade.systemOff(new HomeSecuritySystem());
    }
}
