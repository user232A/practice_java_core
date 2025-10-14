package practice_7.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    // 1. Группировка строк по первой букве
    // Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>() {{
            add("Paris");
            add("Oslo");
            add("Osaka");
            add("Berlin");
            add("Rome");
            add("Madrid");
            add("Bern");
            add("Bolivia");
            add("Bavaria");
            add("Sidney");
        }};

        Map<Character, List<String>> groupByFirstLetter = stringList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        groupByFirstLetter.forEach((letter, city) -> System.out.println(letter + " " + city));
    }
}
