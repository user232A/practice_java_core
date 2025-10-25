package practice_8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task6 implements Runnable {

    // 6. Параллельная обработка данных с использованием потоков
    // Условие задачи:
    // Напишите программу, которая создает 3 потока для обработки элементов в списке. Каждый поток должен обработать
    // 3 элемента из списка и вывести их индекс и значение. После завершения всех потоков, программа должна вывести
    // общий результат: сколько элементов было обработано и их суммы.

    List<Integer> list;
    int from;
    int to;

    static AtomicInteger count = new AtomicInteger(0);
    static AtomicInteger sum = new AtomicInteger(0);

    public Task6(List<Integer> list, int from, int to) {
        this.list = list;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i < to && i < list.size(); i++) {
            System.out.println("Index: " + i + " Value: " + list.get(i));
            sum.addAndGet(list.get(i));
            count.incrementAndGet();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Работал поток " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
        }};

        Task6 task1 = new Task6(list, 0, 3);
        Task6 task2 = new Task6(list, 3, 6);
        Task6 task3 = new Task6(list, 6, 9);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Всего элементов " + count.get());
        System.out.println("Сумма элементов " + sum.get());
    }
}

