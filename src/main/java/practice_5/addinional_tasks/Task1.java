package practice_5.addinional_tasks;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    // 1. Задача
    // Хранение уникальных идентификаторов пользователей
    // Проверить, есть ли пользователь с заданным ID.

    Set<Integer> set = new HashSet<>();

    public void containsUser(int id){
        if (set.contains(id)){
            System.out.println("Данный пользователь с id: " + id + " присутствует в системе");
        } else {
            System.out.println("Данного пользователя в системе нет");
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();

        task1.set.add(4);
        task1.set.add(61);
        task1.set.add(84);
        task1.set.add(14);
        task1.set.add(94);
        task1.set.add(22);
        task1.set.add(64);

        task1.containsUser(44);
    }
}
