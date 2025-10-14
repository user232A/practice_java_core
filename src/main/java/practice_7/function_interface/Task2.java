package practice_7.function_interface;

public class Task2 {
    // 2. Использование анонимного класса
    // Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит
    // сообщение "Hello from anonymous class!".

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        runnable.run();
    }
}
