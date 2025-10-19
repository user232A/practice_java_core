package practice_7.aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task4 {
    // 4. Поиск первого элемента, начинающегося на "Б"
    // Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б",
    // используя Stream API.

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>() {{
            add("Paris");
            add("Oslo");
            add("Berlin");
            add("Rome");
            add("Madrid");
            add("Bavaria");
            add("Sidney");
        }};

        Optional<String> first = stringList.stream().filter(s -> s.startsWith("B")).findFirst();
        first.ifPresent(System.out::println);
    }
}
