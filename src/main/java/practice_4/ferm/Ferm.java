package practice_4.ferm;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Ferm {

    List<Animal> storage = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (storage.isEmpty()) {
            storage.add(animal);
        } else {
            System.out.println("На ферме уже есть фивотное");
        }
    }

    public void manageAnimal() {
        try {
            storage.getFirst().getProduct();
            storage.getFirst().eat();
        } catch (NoSuchElementException e) {
            System.out.println("В зоопарке нет животных");
        }
    }
}
