package practice_5.treeset_tasks;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    // Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.

    Set<Integer> treeSet = new TreeSet<>();

    public void addElement(int number){
        if (!treeSet.contains(number)){
            treeSet.add(number);
            System.out.println("Элемент добавился");
        } else {
            System.out.println("Этот элемент уже есть в коллекции");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();

        task2.treeSet.add(56);
        task2.treeSet.add(21);
        task2.treeSet.add(585);
        task2.treeSet.add(669);
        task2.treeSet.add(14);
        task2.treeSet.add(25);

        task2.addElement(55);
    }
}
