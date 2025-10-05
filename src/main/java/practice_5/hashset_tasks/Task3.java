package practice_5.hashset_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    // Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

    public static Set<String> convertListToSet(List<String> list){
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Петрозаводск");
        list.add("Петрозаводск");
        list.add("Москва");
        list.add("Казань");
        list.add("Уфа");
        list.add("Екатеринбург");
        list.add("Екатеринбург");
        list.add("Новгород");
        list.add("Воронеж");
        list.add("Воронеж");
        list.add("Калуга");

        Set<String> stringSet = convertListToSet(list);

        for(String element : stringSet){
            System.out.println(element);
        }
    }
}
