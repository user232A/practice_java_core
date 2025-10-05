package practice_5.linkedhashmap_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    // Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Mike", 56);
        map.put("Nina", 42);
        map.put("Nancy", 15);
        map.put("Frank", 10);
        map.put("Monica", 40);
        map.put("John", 40);
        map.put("Alex", 9);
        map.put("Bob", 28);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
        }
    }
}
