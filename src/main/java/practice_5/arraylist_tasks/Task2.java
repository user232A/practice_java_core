package practice_5.arraylist_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    // Напишите программу, которая выводит все чётные числа из ArrayList.

    public List<Integer> evenNumber(List<Integer> list){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                temp.add(list.get(i));
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        Task2 task2 = new Task2();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(14);
        list.add(8);
        list.add(11);
        list.add(35);
        list.add(18);

        System.out.println(task2.evenNumber(list));
    }
}
