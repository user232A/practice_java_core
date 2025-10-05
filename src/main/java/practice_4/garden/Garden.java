package practice_4.garden;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Garden {

    List<Plant> gardenStorage = new ArrayList<>();

    public void addPlant(Plant plant) {
        if (gardenStorage.isEmpty()) {
            gardenStorage.add(plant);
        } else {
            System.out.println("В саду уже есть растение");
        }
    }

    public void gardenCare() {
        try {
            gardenStorage.getFirst().getWater();
            gardenStorage.getFirst().getLight();
        } catch (NoSuchElementException e) {
            System.out.println("В саду нет животных");
        }
    }
}
