package practice_5.linkedlist_tasks;

import java.util.LinkedList;
import java.util.List;

public class Task3 {
    // Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

    public String getFirstElement(List<String> list){
        return list.getFirst();
    }

    public String getLastElement(List<String> list){
        return list.getLast();
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        List<String> list = new LinkedList<>();

        list.add("Краснодар");
        list.add("Петрозаводск");
        list.add("Москва");
        list.add("Казань");
        list.add("Орел");
        list.add("Калуга");

        System.out.println(task3.getFirstElement(list));
        System.out.println(task3.getLastElement(list));
    }
}
