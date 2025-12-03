package clean_code.patterns.homework.task_4;

public class SwordFactory extends WeaponFactory{

    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}
