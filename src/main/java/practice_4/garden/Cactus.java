package practice_4.garden;

public class Cactus extends Plant {
    @Override
    void getWater() {
        System.out.println("Кактусу необходимо мало воды");
    }

    @Override
    void getLight() {
        System.out.println("Кактусу необходимо много света");
    }
}
