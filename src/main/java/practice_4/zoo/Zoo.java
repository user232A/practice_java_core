package practice_4.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> zooStorage = new ArrayList<>();

    public void addAnimal(Animal animal) {
        zooStorage.add(animal);
    }

    public void showAllAnimal() {
        for (Animal animal : zooStorage) {
            System.out.println(animal.getName());
        }
    }

    public void demonstration(Animal animal) {
        animal.makeSound();
        animal.move();
    }
}
