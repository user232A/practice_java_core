package practice_5.queue_tasks;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskPriorityQueue {
    // Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(3);
        queue.offer(1);
        queue.offer(8);
        queue.offer(11);
        queue.offer(18);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
