package practice_5.addinional_tasks;

import java.util.ArrayDeque;

public class Task7 {
    // Проверка корректности скобочной последовательности
    // 7.Задача
    // Определить, правильно ли расставлены скобки.

    ArrayDeque<Character> stack = new ArrayDeque<>();

    public void correctBracketSequence(String sequence){
        char[] charArray = sequence.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (stack.isEmpty() || !stack.peek().equals(charArray[i])){
                stack.push(charArray[i]);
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println("Данная скобочная последовательность корректная");
        } else {
            System.out.println("Данная скобочная последовательность не корректная");
        }
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        String sequence = "(()))";
        String sequence2 = "[[]";
        String sequence3 = "{}}";

        task7.correctBracketSequence(sequence);
    }
}
