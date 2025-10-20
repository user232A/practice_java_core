package practice_8;

public class Counter implements Runnable {
    // 4. Задача: использование synchronized
    // Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
    // Создайте два потока, каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу
    // с помощью synchronized.

    int count = 0;

    public synchronized void increment() {
        count++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.count);
    }
}
