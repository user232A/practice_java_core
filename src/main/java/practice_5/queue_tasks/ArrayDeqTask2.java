package practice_5.queue_tasks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeqTask2 {
    // Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

    public static void deletePeek(ArrayDeque<Integer> deque){
        for (int i = deque.size() - 1; i >= 0; i--) {
            System.out.println(deque.getLast());
            deque.pollLast();
        }
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> integerQueue = new ArrayDeque<>();

        integerQueue.add(51);
        integerQueue.add(78);
        integerQueue.add(17);
        integerQueue.add(94);
        integerQueue.add(66);
        integerQueue.add(44);
        integerQueue.add(18);

        System.out.println(integerQueue);

        deletePeek(integerQueue);

    }
}
