package practice_4.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    List<Fish> aquarium = new ArrayList<>();

    public void addFish(Fish fish) {
        if (aquarium.isEmpty()) {
            aquarium.add(fish);
        } else {
            System.out.println("В аквариуме может быть только одна рыба");
        }
    }

    public void showInfo(Fish fish) {
        fish.move();
    }

    public void getInfo() {
        try {
            Fish someFish = aquarium.getFirst();
            someFish.move();
        } catch (Exception e) {
            System.out.println("В аквариуме нет рыбы");
        }
    }
}
