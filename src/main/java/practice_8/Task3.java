package practice_8;

public class Task3 implements Runnable{
    // 3. Задача: использование volatile
    // Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды
    // установите флаг stop = true, чтобы остановить поток.

    int count = 0;
    volatile boolean isStop = false;

    @Override
    public void run() {
        while (!isStop){
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task3 task3 = new Task3();
        Thread thread = new Thread(task3);

        thread.start();
        Thread.sleep(2000);
        task3.isStop = true;
    }
}
