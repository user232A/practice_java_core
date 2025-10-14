package practice_7.aggregation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task1 {
    // 1. Поиск максимального элемента
    // Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>() {{
            add(30);
            add(7);
            add(9);
            add(6);
            add(4);
            add(50);
            add(100);
            add(76);
            add(94);
        }};

        // 1 вариант
        Integer max = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        // 2 вариант
        Optional<Integer> maxOptional = integerList.stream().reduce(Integer::max);
        maxOptional.ifPresent(System.out::println);
    }
}
