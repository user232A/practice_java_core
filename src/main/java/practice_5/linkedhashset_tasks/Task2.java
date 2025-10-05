package practice_5.linkedhashset_tasks;

import java.util.LinkedHashSet;

public class Task2 {
    // Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

    LinkedHashSet<Integer> set = new LinkedHashSet<>();

    public void addUnicElements(int number){
        if (!set.contains(number)){
            set.add(number);
            System.out.println("Элемент добавился");
        } else {
            System.out.println("Этот элемент уже есть в коллекции");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.set.add(5);
        task2.set.add(51);
        task2.set.add(78);
        task2.set.add(55);

        task2.addUnicElements(59);
    }
}
