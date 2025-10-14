package practice_7.aggregation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {
    // 2. Поиск минимального элемента
    //Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.

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
        Optional<Integer> min = integerList.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println);

        // 2 вариант
        Optional<Integer> minimum = integerList.stream().reduce(Integer::min);
        minimum.ifPresent(System.out::println);
    }
}
