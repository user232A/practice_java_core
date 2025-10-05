package practice_3;

import java.util.Scanner;

public class DoWhileSolver {

    Scanner scanner = new Scanner(System.in);

    // 1. Запрос положительного числа

    public void requestPositiveNumber() {
        int number = 0;

        do {
            System.out.print("Введите положительное число больше 0 ");
            number = scanner.nextInt();

        } while (number <= 0);

        System.out.println("Вы ввели число " + number);
    }

    // 2. Проверка пароля

    public void checkPassword() {

        String password = "abcd";
        String enteredPass = "";

        do {

            System.out.print("Введите пароль ");
            enteredPass = scanner.nextLine();

        } while (!enteredPass.equals(password));

        System.out.println("Ваш пароль верный");
    }

    // 3. Вывод чисел от 1 до 10 с использованием do-while

    public void printNumbers(int count) {

        if (count <= 0) {
            System.out.println("Программа не работает с числом 0 и отрицательными числами");
            return;
        }

        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= count);
    }

    // 4. Завершение программы по команде "exit"

    public void finishProgram() {
        String command = "exit";
        String enteredCommand = "";

        do {
            System.out.print("Введите команду на завершение работы программы ");
            enteredCommand = scanner.nextLine();

        } while (!enteredCommand.equals(command));

        System.out.println("Прграмма завершила работу");
    }

    // 5. Подсчёт количества цифр в числе

    public void countNumbers() {
        int count = 0;

        System.out.print("Введите число ");
        int number = scanner.nextInt();

        do {
            number = number / 10;
            count++;

        } while (number > 0);

        System.out.println(count);
    }


    public static void main(String[] args) {

        DoWhileSolver solver = new DoWhileSolver();

        // 1. Запрос положительного числа

        //solver.requestPositiveNumber();

        // 2. Проверка пароля

        //solver.checkPassword();

        // 3. Вывод чисел от 1 до 10 с использованием do-while

        solver.printNumbers(9);
        System.out.println();

        // 4. Завершение программы по команде "exit"

        //solver.finishProgram();

        // 5. Подсчёт количества цифр в числе

        //solver.countNumbers();
    }
}
