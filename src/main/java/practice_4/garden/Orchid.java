package practice_4.garden;

public class Orchid extends Plant {
    @Override
    void getWater() {
        System.out.println("Орхидее необходимо много воды");
    }

    @Override
    void getLight() {
        System.out.println("Орхидее необходимо мало света");
    }
}
