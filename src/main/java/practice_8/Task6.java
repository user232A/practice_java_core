package practice_8;

import java.util.ArrayList;
import java.util.List;

public class Task6 implements Runnable {
    // 6. Параллельная обработка данных с использованием потоков
    // Условие задачи:
    // Напишите программу, которая создает 3 потока для обработки элементов в списке. Каждый поток должен обработать
    // 3 элемента из списка и вывести их индекс и значение. После завершения всех потоков, программа должна вывести
    // общий результат: сколько элементов было обработано и их суммы.

    List<Integer> list;

    int from = 0;
    int count = 0;
    int sum = 0;


    @Override
    public void run() {
        synchronized (this) {
            for (int i = from; i <= from + 2 && i < list.size(); i++) {
                System.out.println("Index: " + i + " Value: " + list.get(i));
                sum += list.get(i);
                count++;
            }
            System.out.println("Работал поток " + Thread.currentThread().getName());
        }
        from = count;
    }

    public static void main(String[] args) throws InterruptedException {
        Task6 task6 = new Task6();
        task6.list = new ArrayList<>() {{
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

        Thread thread1 = new Thread(task6);
        Thread thread2 = new Thread(task6);
        Thread thread3 = new Thread(task6);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Всего элементов " + task6.count);
        System.out.println("Сумма элементов " + task6.sum);
    }
}
