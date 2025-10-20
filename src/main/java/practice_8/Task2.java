package practice_8;

public class Task2 {
    // 2. Задача: создание двух потоков
    // Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз
    // с небольшой задержкой.

    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.print("A ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Произошла ошибка");
                }
            }
        }
    };

    Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.print("B ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Произошла ошибка");
                }
            }
        }
    };

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Thread thread1 = new Thread(task2.runnable1);
        Thread thread2 = new Thread(task2.runnable2);

        thread1.start();
        thread2.start();
    }
}
