package practice_3;

import java.util.Scanner;

public class IfElseSolver {

    Scanner scanner = new Scanner(System.in);

    // 1. Определение знака числа

    public String checkNumber() {
        String number;

        System.out.print("Введите число ");
        int nextInt = scanner.nextInt();

        if (nextInt > 0) {
            number = "Число положительное";
        } else if (nextInt < 0) {
            number = "Число отрицательное";
        } else {
            number = "Число равно нулю";
        }
        return number;
    }

    // 2. Поиск наибольшего из двух чисел

    public int maxNumber(int a, int b) {
        return Math.max(a, b);
    }

    // 3. Вывод оценки по шкале 1–5

    public void checkGrade() {
        String yourGrade = "";
        System.out.print("Введите число ");
        int grade = scanner.nextInt();

        if (grade == 5) {
            yourGrade = "Отлично";
        } else if (grade == 4) {
            yourGrade = "Хорошо";
        } else if (grade == 3) {
            yourGrade = "Удовлетворительно";
        } else if (grade == 2 || grade == 1) {
            yourGrade = "Неудовлетворительно";
        } else {
            yourGrade = "Такой оценки не существует";
        }

        System.out.println(yourGrade);
    }

    // 4. Проверка на чётность

    public void checkEven() {

        System.out.print("Введите число ");
        int nextInt = scanner.nextInt();
        if (nextInt == 0) {
            System.out.println("Вы ввели число 0");
        } else if (nextInt % 2 == 0) {
            System.out.println("Число " + nextInt + " положительное");
        } else {
            System.out.println("Число " + nextInt + " отрицательное");
        }
    }

    // 5. Определение размера скидки по возрасту

    public void getDiscount() {
        String discount = "";
        System.out.print("Введите ваш возраст ");

        int nextInt = scanner.nextInt();

        if (nextInt < 18 && nextInt > 0) {
            discount = "Ваша скидка 25%";
        } else if (nextInt == 0 || nextInt < 0) {
            discount = "Вы ввели некорректный возраст";
        } else if (nextInt > 65) {
            discount = "Ваша скидка 30%";
        } else {
            discount = "У вас нет скидки";
        }

        System.out.println(discount);
    }

    // 6. Оценка результата теста по баллам

    public void getTestResults() {
        String result = "";
        System.out.print("Введите оценку ");

        int nextInt = scanner.nextInt();

        if (nextInt >= 90) {
            result = "Отлично";
        } else if (nextInt >= 75 && nextInt <= 89) {
            result = "Хорошо";
        } else if (nextInt >= 60 && nextInt <= 74) {
            result = "Удовлетворительно";
        } else if (nextInt <= 0) {
            result = "Некорректная оценка";
        } else {
            result = "Неудовлетворительно";
        }

        System.out.println(result);
    }
}
