package practice_5.linkedhashmap_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    // Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(10, 0.75f, true);

        map.put("Mike", "avito.ru");
        map.put("Nina", "gismeteo.ru");
        map.put("Nancy", "avito.ru");
        map.put("Frank", "tesla.com");
        map.put("Monica", "ford.com");
        map.put("John", "total.com");
        map.put("Alex", "db.com");
        map.put("Bob", "gm.com");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Name: " + entry.getKey() + " domen: " + entry.getValue());
        }

        map.put("Mike", "ford.com");

        System.out.println();

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Name: " + entry.getKey() + " domen: " + entry.getValue());
        }
    }

}
