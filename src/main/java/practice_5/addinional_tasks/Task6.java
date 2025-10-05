package practice_5.addinional_tasks;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    // Структура телефонной книги
    // 6.Задача
    // Хранить имена и номера телефонов, быстро находить номер по имени.

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        phoneBook.put("Kate", 4587);
        phoneBook.put("Dan", 9541);
        phoneBook.put("Bob", 3247);
        phoneBook.put("Stas", 9547);
        phoneBook.put("Petr", 2541);
        phoneBook.put("Monica", 6224);
        phoneBook.put("Sam", 7554);

        System.out.println("Number of phone: " + phoneBook.get("Sam"));
    }
}
