package practice_3;

import java.util.Scanner;

public class SwitchSolver {

    Scanner scanner = new Scanner(System.in);

    // 1. Вывод дня недели по номеру

    public void getDayOfWeek() {
        String day = "";
        System.out.print("Введите число от 1 до 7 ");

        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case 1 -> day = "Понедельник";
            case 2 -> day = "Вторник";
            case 3 -> day = "Среда";
            case 4 -> day = "Четверг";
            case 5 -> day = "Пятница";
            case 6 -> day = "Суббота";
            case 7 -> day = "Воскресение";
            default -> day = "Вы ввели некорректное число";
        }

        System.out.println(day);
    }

    // 2. Стоимость билета по дню недели

    public void getTicketAmount() {

        String amount = "";
        System.out.print("Введите день недели ");

        int nextInt = scanner.nextInt();

        switch (nextInt) {
            case (1), (2), (3), (4), (5) -> amount = "300 рублей";
            case (6), (7) -> amount = "450 рублей";
            default -> amount = "Вы ввели некорректное число";
        }

        System.out.println(amount);

    }

    // 3. Перевод числовых оценок в буквенные (A–F)

    public void convertToWord() {

        String number = "";

        System.out.print("Введите число от 1 до 100 ");

        int nextInt = scanner.nextInt();

        if (nextInt >= 90 && nextInt <= 100) {
            number = "A";
        } else if (nextInt >= 80 && nextInt <= 89) {
            number = "B";
        } else if (nextInt >= 70 && nextInt <= 79) {
            number = "C";
        } else if (nextInt >= 60 && nextInt <= 69) {
            number = "D";
        } else if (nextInt >= 0 && nextInt < 60) {
            number = "F";
        } else {
            number = "Некорректная оценка";
        }

        System.out.println(number);

    }

    // 4. Обработка текстовых команд

    public void wordHandler() {

        String command = "";

        System.out.print("Введите команду ");

        String nextLine = scanner.nextLine();

        switch (nextLine) {
            case "start" -> command = "Система запущена";
            case "stop" -> command = "Система остановлена";
            case "restart" -> command = "Система перезапущена";
            case "status" -> command = "Система ожидает присвоения статуса";
            default -> command = "Введена некорректная команда";
        }

        System.out.println(command);
    }

    // 5. Простой калькулятор с использованием switch

    public void calculate() {

        int result = 0;

        System.out.print("Введите первое число кроме 0 ");
        int firstNumber = scanner.nextInt();

        while (firstNumber == 0) {
            System.out.print("Вы ввели 0, введите новое число ");
            firstNumber = scanner.nextInt();
        }

        System.out.print("Введите второе число ");
        int secondNumber = scanner.nextInt();

        while (secondNumber == 0) {
            System.out.print("Вы ввели 0, введите новое число ");
            secondNumber = scanner.nextInt();
        }

        scanner.nextLine();

        System.out.print("Введите математическую операцию ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        // 1. Вывод дня недели по номеру

        SwitchSolver switchSolver = new SwitchSolver();

        //switchSolver.getDayOfWeek();

        // 2. Стоимость билета по дню недели

        //switchSolver.getTicketAmount();

        // 3. Перевод числовых оценок в буквенные (A–F)

        //switchSolver.convertToWord();

        // 4. Обработка текстовых команд

        //switchSolver.wordHandler();

        // 5. Простой калькулятор с использованием switch

        switchSolver.calculate();


    }

}
