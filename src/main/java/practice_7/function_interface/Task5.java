package practice_7.function_interface;

import java.util.function.Consumer;

public class Task5 {
    // 5. Использование Consumer
    // Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.

    String paris = "Paris";
    String rome = "Rome";
    String madrid = "Madrid";

    Consumer<String> consumer = System.out::println;

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.consumer.accept(task5.paris);
        task5.consumer.accept(task5.rome);
        task5.consumer.accept(task5.madrid);
    }
}
