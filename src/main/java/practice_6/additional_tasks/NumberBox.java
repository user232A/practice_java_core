package practice_6.additional_tasks;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {
    // Работа с числами
    // Задача: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.

    List<T> list = new ArrayList<>();

    public double getSum() {
        double sum = 0;
        for (T item : list) {
            sum += item.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.list.add(56);
        integerNumberBox.list.add(5);
        integerNumberBox.list.add(94);
        integerNumberBox.list.add(17);
        integerNumberBox.list.add(97);

        System.out.println(integerNumberBox.getSum());

        NumberBox<Float> floatNumberBox = new NumberBox<>();
        floatNumberBox.list.add(56.4f);
        floatNumberBox.list.add(94.495f);
        floatNumberBox.list.add(354.494f);
        floatNumberBox.list.add(569.411f);

        System.out.println(floatNumberBox.getSum());
    }
}
