package practice_5.addinional_tasks;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    // Хранение ключей и значений (настройки приложения)
    // 3. Задача:
    // Хранить параметры приложения по имени и значению.

    Map<String, String> map = new HashMap<>();

    public void storageSettings(String name, String value){
        map.put(name, value);
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.storageSettings("capacity", "55");
        task3.storageSettings("rps", "55k");
        task3.storageSettings("theme", "dark");

        for (Map.Entry<String, String> entry : task3.map.entrySet()){
            System.out.println("Settings: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
