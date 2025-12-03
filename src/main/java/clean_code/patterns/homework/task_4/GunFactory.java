package clean_code.patterns.homework.task_4;

public class GunFactory extends WeaponFactory{

    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
