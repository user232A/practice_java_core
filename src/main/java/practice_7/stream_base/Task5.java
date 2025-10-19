package practice_7.stream_base;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    // 5. Удаление дубликатов из списка
    // Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты,
    // используя Stream API.

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>() {{
            add(30);
            add(7);
            add(6);
            add(9);
            add(6);
            add(4);
            add(4);
            add(50);
            add(100);
            add(100);
            add(76);
            add(94);
            add(94);
        }};

        List<Integer> uniqueElements = integerList.stream().distinct().toList();
        System.out.println(integerList);
        System.out.println(uniqueElements);
    }
}
