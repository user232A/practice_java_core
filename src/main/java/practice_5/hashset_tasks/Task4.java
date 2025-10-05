package practice_5.hashset_tasks;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    // Создайте HashSet, содержащий набор имен.
    // Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

    public static void isContainsName(Set<String> set, String name){
        System.out.println(set.contains(name));
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Маша");
        set.add("Петр");
        set.add("Кирилл");
        set.add("Олег");
        set.add("Оксана");
        set.add("Лена");

        isContainsName(set, "Оксана");
    }
}
