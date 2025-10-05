package practice_5.linkedlist_tasks;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    // Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("привет");
        list.add("Москва");
        list.add("Казань");
        list.add("Орел");
        list.add("Калуга");

        System.out.println(list);
    }
}
