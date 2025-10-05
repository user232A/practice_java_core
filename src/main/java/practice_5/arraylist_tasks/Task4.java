package practice_5.arraylist_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    // Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.

    public int sumNumbers(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(10);
        list.add(50);
        list.add(50);
        list.add(50);

        System.out.println(task4.sumNumbers(list));

    }
}
