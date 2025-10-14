package practice_7.stream_base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    // 1. Фильтрация строк по длине больше 5
    // Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и
    // менее, используя Stream API.

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>() {{
            add("Paris");
            add("Oslo");
            add("Rome");
            add("Madrid");
            add("Пекин");
            add("Sidney");
        }};

        List<String> modifiedList = stringList.stream().filter(s -> s.length() > 5).toList();
        System.out.println(stringList);
        System.out.println(modifiedList);
    }
}
