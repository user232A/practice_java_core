package practice_3;

import java.util.Scanner;

public class ContClass {

    Scanner scanner = new Scanner(System.in);

    // 1. Сумма чисел до первого отрицательного (использовать break)

    public void sumPositiveNumbers() {
        int sum = 0;
        int number = 0;

        do {
            System.out.println("Введите положительное число ");
            number = scanner.nextInt();
            if (number <= 0) {
                break;
            }
            sum += number;

        } while (number > 0);

        System.out.println("Сумма введенных чисел " + sum);
    }

    // 2. Пропуск чисел, делящихся на 3 (использовать continue)

    public void ignoreNumberThree() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    // 3. Вывод только положительных чисел (использовать continue)

    public void printPositiveNumbers() {
        int count = 0;

        do {

            System.out.println("Введите положительное число ");
            int number = scanner.nextInt();
            if (number <= 0) {
                continue;
            }
            System.out.println(number + " ");
            count++;

        } while (count < 5);
    }

    // 4. Ввод строк до команды "stop" (использовать break)

    public void finishProgram() {
        String command = "stop";
        String enteredCommand = "";
        boolean isStop = false;

        while (!isStop) {
            System.out.print("Введите строку ");
            enteredCommand = scanner.nextLine();
            if (enteredCommand.equals(command)) {
                isStop = true;
                break;
            }

            System.out.println("Ваша команда " + enteredCommand);
        }

        System.out.println("Ваша команда " + enteredCommand);
    }


    public static void main(String[] args) {

        ContClass contClass = new ContClass();

        // 1. Сумма чисел до первого отрицательного (использовать break)

        //contClass.sumPositiveNumbers();

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)

        //contClass.ignoreNumberThree();

        // 3. Вывод только положительных чисел (использовать continue)

        //contClass.printPositiveNumbers();

        // 4. Ввод строк до команды "stop" (использовать break)

        contClass.finishProgram();

    }
}
