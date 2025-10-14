package practice_7.stream_base;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    // 4. Создание списка квадратов чисел
    // Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список, где каждое число 
    // заменено на его квадрат, используя Stream API.

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

        List<Integer> squareList = integerList.stream().mapToInt(n -> n * n).boxed().toList();
        System.out.println(integerList);
        System.out.println(squareList);
    }
}
