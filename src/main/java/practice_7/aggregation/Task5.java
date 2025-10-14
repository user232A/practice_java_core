package practice_7.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    // 5. Проверка наличия хотя бы одного элемента по условию
    // Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке, который удовлетворяет
    // заданному условию (например, является чётным числом), используя Stream API.

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>() {{
            add("Paris");
            add("Oslo");
            add("Berlin");
            add("Rome");
            add("Madrid");
            add("Bavaria");
            add("Sidney");
        }};

        boolean haveShortString = stringList.stream().anyMatch(s -> s.length() == 10);
        boolean isStartsWithO = stringList.stream().anyMatch(s -> s.startsWith("O"));

        System.out.println("Есть элемент удовлетворяющий условию? " + haveShortString);
        System.out.println("Есть элемент удовлетворяющий условию? " + isStartsWithO);
    }
}
