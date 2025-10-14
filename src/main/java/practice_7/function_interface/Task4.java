package practice_7.function_interface;

import java.util.function.Function;

public class Task4 {
    // 4. Лямбда-выражение с Function
    // Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

    String paris = "Paris";
    String rome = "Rome";
    String madrid = "Madrid";

    Function<String, Integer> function = String::length;

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println("Длина строки " + task4.paris + " - " + task4.function.apply(task4.paris) + " символов");
        System.out.println("Длина строки " + task4.rome + " - " + task4.function.apply(task4.rome) + " символов");
        System.out.println("Длина строки " + task4.madrid + " - " + task4.function.apply(task4.madrid) + " символов");
    }
}
