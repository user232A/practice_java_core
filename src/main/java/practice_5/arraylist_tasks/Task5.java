package practice_5.arraylist_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    // Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.

    public int maxNumber(List<Integer> list){
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Task5 task5 = new Task5();
        List<Integer> list = new ArrayList<>();
        list.add(560);
        list.add(5);
        list.add(98);
        list.add(123);
        list.add(3420);
        list.add(62);
        list.add(84);

        System.out.println(task5.maxNumber(list));

    }
}
