package practice_5.addinional_tasks;

import java.util.LinkedList;

public class Task2 {
    // Очередь задач для обработки
    // 2. Задача
    //Хранить задачи в порядке поступления и обрабатывать по очереди.

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Task1");
        list.add("Task2");
        list.add("Task3");
        list.add("Task4");
        list.add("Task5");
        list.add("Task6");

        while (!list.isEmpty()){
            System.out.println(list.getFirst());
            list.poll();
        }
    }
}
