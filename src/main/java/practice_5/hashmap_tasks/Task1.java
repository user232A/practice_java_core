package practice_5.hashmap_tasks;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    // Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mike", 56);
        map.put("Nina", 42);
        map.put("Nancy", 35);
        map.put("Frank", 40);
        map.put("Bob", 28);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
        }
    }
}
