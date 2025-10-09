package practice_6.additional_tasks;

import java.util.HashMap;
import java.util.Map;

public class CollectionType {
    // Коллекция с обобщёнными типами
    //Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.

    public <K, V> void printInfo(Map<K, V> map) {
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        CollectionType type = new CollectionType();

        Map<String, Integer> map = new HashMap<>();
        map.put("Mike", 4566);
        map.put("Nina", 5477);
        map.put("Bob", 4584);
        map.put("Dan", 5484);

        type.printInfo(map);
    }
}
