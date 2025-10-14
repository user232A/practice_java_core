package practice_7.stream_base;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    // 2. Фильтрация чисел, кратных 5
    // Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>() {{
            add(30);
            add(6);
            add(4);
            add(50);
            add(100);
            add(76);
            add(94);
        }};

        List<Integer> modifiedList = integerList.stream().filter(n -> n % 5 == 0).toList();
        System.out.println("Before filter " + integerList);
        System.out.println("After filter " + modifiedList);
    }
}
