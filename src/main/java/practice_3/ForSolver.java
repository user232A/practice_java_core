package practice_3;

import java.util.Scanner;

public class ForSolver {

    Scanner scanner = new Scanner(System.in);

    // 1. Вывод чисел от 1 до 100, делящихся на 3

    public static void divideForThree(){
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    // 2. Сумма чисел от 1 до n

    public void getSumNumbers(){

        int sum = 0;

        System.out.print("Введите число ");
        int n = scanner.nextInt();

        for (int i = 1; i < (n + 1); i++) {
            sum += i;
        }

        System.out.println(sum);

    }

    // 3. Таблица умножения для числа

    public void multiplyTable(){

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    // 4. Проверка на простое число

    public boolean simpleNumber(){

        boolean isPrime = true;

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        while (number <= 0){
            System.out.print("Введите число больше 0 ");
            number = scanner.nextInt();
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    // 5. Вывод чисел от 1 до 10

    public void printNumbers(int number){

        if (number <= 0) {
            System.out.println("У вас число отрицательное или равно нулю");
            return;
        }

        for (int i = 1; i < (number + 1); i++) {
            System.out.print(i + " ");
        }
    }



    public static void main(String[] args) {

        ForSolver forSolver = new ForSolver();

        // 1. Вывод чисел от 1 до 100, делящихся на 3

        divideForThree();
        System.out.println();

        // 2. Сумма чисел от 1 до n

        //forSolver.getSumNumbers();
        System.out.println();

        // 3. Таблица умножения для числа

        //forSolver.multiplyTable();

        // 4. Проверка на простое число

        //System.out.println(forSolver.simpleNumber());

        // 5. Вывод чисел от 1 до 10

        forSolver.printNumbers(0);
    }
}
