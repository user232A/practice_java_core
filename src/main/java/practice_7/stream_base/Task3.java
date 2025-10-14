package practice_7.stream_base;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    // 3. Преобразование строк в их длины
    // Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину,
    // используя Stream API.

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>() {{
            add("Paris");
            add("Oslo");
            add("Rome");
            add("Madrid");
            add("Пекин");
            add("Sidney");
        }};

        List<Integer> integerList = stringList.stream().map(String::length).toList();
        System.out.println(stringList);
        System.out.println(integerList);
    }
}
