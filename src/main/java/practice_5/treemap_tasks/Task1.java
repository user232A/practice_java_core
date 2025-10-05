package practice_5.treemap_tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    // Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Misha", 45);
        map.put("Masha", 52);
        map.put("Oleg", 55);
        map.put("Lena", 59);
        map.put("Fedor", 49);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Name: " + entry.getKey() + " Балл: " + entry.getValue());
        }
    }
}
