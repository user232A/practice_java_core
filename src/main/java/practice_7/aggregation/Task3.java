package practice_7.aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task3 {
    // 3. Сумма всех элементов списка
    // Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.

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

        Optional<Integer> sum = integerList.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);
    }
}
