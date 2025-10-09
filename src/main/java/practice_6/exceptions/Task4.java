package practice_6.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    // 4. Создание и использование собственного непроверяемого исключения
    // Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
    // является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям, функция должна
    // выбрасывать непроверяемое исключение.

    String emilPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    public boolean isCorrectEmail(String email) {

        Pattern pattern = Pattern.compile(this.emilPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidEmailFormat("Invalid email");
        }
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.isCorrectEmail("example@mail.ru"));
    }
}
