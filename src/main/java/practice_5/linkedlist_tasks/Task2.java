package practice_5.linkedlist_tasks;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    // Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.offer("Москва");
        stringQueue.offer("Париж");
        stringQueue.offer("Берлин");

        stringQueue.forEach(System.out::println);
        System.out.println();

        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
    }
}
