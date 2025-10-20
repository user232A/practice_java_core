package practice_8;

import java.util.Objects;
import java.util.concurrent.*;

public class Task5 implements Runnable {
    // 5. Реализация пула потоков для обработки задач
    // Условие задачи:
    // Напишите программу, которая использует ExecutorService для создания пула потоков, в котором несколько потоков
    // обрабатывают задачи. Каждая задача — это выполнение простого теста с задержкой. Программа должна создать
    // пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды. После выполнения всех задач,
    // результат должен быть выведен в главном потоке.

    final Object lock = new Object();

    static int sum = 0;

    @Override
    public void run() {
        synchronized (lock){
            for (int i = 1; i < 100; i++) {
                sum += i;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
            System.out.println("Закончил работу " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 1; i < 5; i++) {
            executorService.execute(new Task5());
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(sum);
    }
}
