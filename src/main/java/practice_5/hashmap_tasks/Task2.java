package practice_5.hashmap_tasks;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    // Проверьте, есть ли определённое имя в HashMap.

    public boolean isContainsName(HashMap<String, Integer> map, String name){
        boolean isExist = false;
        if (map.containsKey(name)){
            return true;
        }
        return isExist;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mike", 56);
        map.put("Nina", 42);
        map.put("Nancy", 35);
        map.put("Frank", 40);
        map.put("Bob", 28);

        System.out.println(task2.isContainsName(map, "Bob"));
    }
}
