package practice_5.queue_tasks;

import java.util.ArrayDeque;

public class ArrayDeqTask3 {
    // Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.

    public static void main(String[] args) {
        ArrayDeque<Integer> integerQueue = new ArrayDeque<>();

        integerQueue.offerFirst(15);
        integerQueue.offerLast(51);
        integerQueue.offerFirst(94);
        integerQueue.offerLast(20);
        integerQueue.offerLast(33);
        integerQueue.offerFirst(93);
        integerQueue.offerLast(44);
        integerQueue.offerFirst(71);
        integerQueue.offerFirst(24);

        System.out.println(integerQueue);

        System.out.println("Элемент в начале queue: " + integerQueue.getFirst());
        System.out.println("Элемент в конце queue: " + integerQueue.getLast());
    }
}
