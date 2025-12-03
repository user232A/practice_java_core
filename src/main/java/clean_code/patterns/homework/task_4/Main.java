package clean_code.patterns.homework.task_4;

public class Main {
    public static void main(String[] args) {

        WeaponFactory factory;
        String weapon = "Bow";

        if ("Gun".equals(weapon)){
            factory = new GunFactory();
        } else if ("Bow".equals(weapon)) {
            factory = new BowFactory();
        } else {
            factory = new SwordFactory();
        }

        factory.createWeapon().attack();
    }
}
