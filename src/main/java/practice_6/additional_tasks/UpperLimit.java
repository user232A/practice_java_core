package practice_6.additional_tasks;

import java.util.ArrayList;
import java.util.List;

public class UpperLimit {
    // Ограничение сверху
    // Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.

    public static void getSum(List<? extends Number> list){
        double sum = 0;
        if (list != null) {
            for (Number item : list){
                sum += item.doubleValue();
            }
            System.out.println(sum);
        } else {
            System.out.println("List is null");
        }
    }

    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        doubles.add(5.0);
        doubles.add(9.0);
        doubles.add(4.5);
        doubles.add(7.8);

        List<Integer> integers = new ArrayList<>();
        integers.add(9);
        integers.add(45);
        integers.add(10);
        integers.add(5);

        getSum(doubles);
        getSum(integers);
    }
}
