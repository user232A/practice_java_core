package practice_7.function_interface;

public class Task1 {
    // 1. Создайте свой функциональный интерфейс
    // Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
    // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

    MathOperation<Integer, Integer> sum = Integer::sum;
    MathOperation<Integer, Integer> substraction = (a, b) -> a - b;
    MathOperation<Integer, Integer> multiply = (a, b) -> a * b;
    MathOperation<Integer, Integer> divide = (a, b) -> a / b;

    public static void main(String[] args) {
        int a = 50;
        int b = 10;

        Task1 task1 = new Task1();

        System.out.println("Sum " + a + " + " + b + " = " + task1.sum.operation(a, b));
        System.out.println("Substraction " + a + " - " + b + " = " + task1.substraction.operation(a, b));
        System.out.println("Multiply " + a + " * " + b + " = " + task1.multiply.operation(a, b));
        System.out.println("Divide " + a + " / " + b + " = " + task1.divide.operation(a, b));
    }
}
