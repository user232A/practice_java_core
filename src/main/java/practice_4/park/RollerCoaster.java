package practice_4.park;

public class RollerCoaster extends Attraction {

    public RollerCoaster(String name) {
        super(name);
    }

    @Override
    public void check() {
        System.out.println(this.getName() + " проверка безопасности");
    }
}
