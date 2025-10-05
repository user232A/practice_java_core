package practice_5.linkedhashset_tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {
    // Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Петрозаводск");
        linkedHashSet.add("Москва");
        linkedHashSet.add("Липецк");
        linkedHashSet.add("Казань");
        linkedHashSet.add("Уфа");

        System.out.println(linkedHashSet);
    }
}
