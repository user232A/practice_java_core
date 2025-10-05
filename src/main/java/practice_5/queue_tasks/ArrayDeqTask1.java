package practice_5.queue_tasks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeqTask1 {
    // Создайте ArrayDeque, добавьте 5 элементов и выведите их.

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new ArrayDeque<>();

        integerQueue.offer(56);
        integerQueue.offer(67);
        integerQueue.offer(76);
        integerQueue.offer(17);
        integerQueue.offer(88);

        System.out.println(integerQueue);
    }
}
