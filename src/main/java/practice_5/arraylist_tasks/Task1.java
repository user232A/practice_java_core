package practice_5.arraylist_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    // Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(81);
        list.add(256);
        list.add(27);
        list.add(85);

        System.out.println(list);
    }
}
