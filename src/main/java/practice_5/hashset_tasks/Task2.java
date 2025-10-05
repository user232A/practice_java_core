package practice_5.hashset_tasks;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    // Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

    public boolean isExistNumber(Set<Integer> set, int number){
        boolean exist = false;

        if (set.contains(number)){
            return exist = true;
        }
        return exist;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(78);
        set.add(85);
        set.add(85);
        set.add(31);
        set.add(92);

        System.out.println(task2.isExistNumber(set, 78));
    }
}
