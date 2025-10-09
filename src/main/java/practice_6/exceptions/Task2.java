package practice_6.exceptions;

public class Task2 {
    // 2. Обработка непроверяемого исключения
    // Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
    // Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("На ноль делить нельзя");
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
}
