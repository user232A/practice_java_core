package practice_7.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    // 3. Поиск среднего значения чисел
    //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.

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

        Double averageValue = integerList.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println(averageValue);
    }
}
