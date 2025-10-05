package practice_5.linkedhashmap_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    // Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

    Map<String, Integer> map = new LinkedHashMap<>();

    public void getContact(String name){
        String tempName = "";
        int number = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (name.equals(entry.getKey())){
                tempName = entry.getKey();
                number = entry.getValue();
                break;
            }
        }
        if (tempName.equals(name)){
            System.out.println("Contact: " + tempName + " Number: " + number);
        } else {
            System.out.println("Такого контакта нет");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();

        task2.map.put("Mike", 5656);
        task2.map.put("Nina", 4214);
        task2.map.put("Nancy", 1589);
        task2.map.put("Frank", 1001);
        task2.map.put("Monica", 4095);
        task2.map.put("John", 4014);
        task2.map.put("Alex", 9694);
        task2.map.put("Bob", 2801);

        task2.getContact("Mike");
    }
}
