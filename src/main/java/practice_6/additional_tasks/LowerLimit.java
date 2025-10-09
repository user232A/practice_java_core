package practice_6.additional_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerLimit {
    // Ограничение снизу
    // Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.

    public static void addNumbers(List<? super Integer> list, Integer ... a){
        if (list != null){
            list.addAll(Arrays.asList(a));
        }
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        addNumbers(list, 5, 78, 95, 78, 24);
        System.out.println(list);
    }
}
