package practice_3;

import java.util.Scanner;

public class WhileSolver {

    Scanner scanner = new Scanner(System.in);

    // 1. Вычисление факториала с помощью while

    public int factorial() {

        int result = 1;
        int i = 1;

        System.out.println("Введите число ");
        int number = scanner.nextInt();

        while (i <= number) {
            result = i * result;
            i++;
        }
        return result;
    }

    // 2. Вывод всех чётных чисел до заданного

    public void evenNumbers() {

        int i = 1;

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    //3. Обратный отсчёт от введённого числа до 1

    public void revertCount() {

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.print(number + " ");
            number--;
        }
    }


    public static void main(String[] args) {

        WhileSolver solver = new WhileSolver();

        // 1. Вычисление факториала с помощью while

        //System.out.println(solver.factorial());

        // 2. Вывод всех чётных чисел до заданного

        //solver.evenNumbers();

        // 3. Обратный отсчёт от введённого числа до 1

        solver.revertCount();
    }
}
