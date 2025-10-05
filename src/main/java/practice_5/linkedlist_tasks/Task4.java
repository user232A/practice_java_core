package practice_5.linkedlist_tasks;

import java.util.LinkedList;
import java.util.List;

public class Task4 {
    // Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.

    public int sumNumbers(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        List<Integer> list = new LinkedList<>();
        list.add(46);
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(10);

        System.out.println(task4.sumNumbers(list));
    }
}
