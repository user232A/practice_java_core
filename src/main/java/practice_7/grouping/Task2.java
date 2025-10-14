package practice_7.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    // 2. Группировка чисел по чётности
    // Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>() {{
            add(30);
            add(7);
            add(4);
            add(51);
            add(99);
            add(51);
            add(41);
            add(100);
            add(76);
            add(94);
        }};

        Map<Boolean, List<Integer>> numbers = integerList.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        numbers.forEach((b, n) -> System.out.println(b + " " + n));
    }
}
