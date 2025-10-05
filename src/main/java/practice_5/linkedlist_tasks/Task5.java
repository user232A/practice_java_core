package practice_5.linkedlist_tasks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task5 {
    // Используйте ListIterator для прохода по LinkedList в обоих направлениях.

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Краснодар");
        list.add("Петрозаводск");
        list.add("Москва");
        list.add("Казань");
        list.add("Орел");
        list.add("Калуга");


        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
