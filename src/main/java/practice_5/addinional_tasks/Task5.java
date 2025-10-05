package practice_5.addinional_tasks;

import java.util.ArrayDeque;

public class Task5 {
    // История действий пользователя
    // 5. Задача:
    // Хранить действия пользователя для отмены и повтора.

    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.push("Move 1");
        deque.push("Move 2");
        deque.pop();
        deque.push("Move 3");
        deque.push("Move 4");
        deque.push("Move 5");
        deque.pop();
        deque.push("Move 6");

        System.out.println(deque);
    }
}
