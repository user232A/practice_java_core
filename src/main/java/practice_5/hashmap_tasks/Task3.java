package practice_5.hashmap_tasks;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    // Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.

    public static void printMinor(HashMap<String, Integer> hashMap){
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            if (entry.getValue() < 18){
                System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mike", 56);
        map.put("Nina", 42);
        map.put("Nancy", 15);
        map.put("Frank", 10);
        map.put("Monica", 40);
        map.put("John", 40);
        map.put("Alex", 9);
        map.put("Bob", 28);

        printMinor(map);
    }
}
