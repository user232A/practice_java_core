package clean_code.patterns.homework.task_4;

public class BowFactory extends WeaponFactory{

    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}
