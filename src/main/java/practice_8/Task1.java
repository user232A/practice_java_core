package practice_8;

public class Task1 extends Thread{
    // 1. Задача: создание одного потока
    // Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!"
    // 5 раз с паузой в 1 секунду между сообщениями.

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Привет из потока! " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Произошла ошибка");
            }
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread thread = new Thread(task1);
        thread.start();
    }
}
