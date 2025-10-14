package practice_7.function_interface;

import java.util.function.Predicate;

public class Task3 {
    // 3. Лямбда-выражение с Predicate
    // Задача: Напишите лямбду, которая проверяет, является ли число чётным.

    int a = 50;
    int b = 7;

    Predicate<Integer> isEven = number -> number % 2 == 0;

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println("Число " + task3.a + " четное? " + task3.isEven.test(task3.a));
        System.out.println("Число " + task3.b + " четное? " + task3.isEven.test(task3.b));
    }
}
