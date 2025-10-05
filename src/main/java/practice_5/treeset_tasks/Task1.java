package practice_5.treeset_tasks;

import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    // Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

    public static void main(String[] args) {

        Set<Integer> integerSet = new TreeSet<>();

        integerSet.add(5);
        integerSet.add(54);
        integerSet.add(25);
        integerSet.add(59);
        integerSet.add(94);

        System.out.println(integerSet);
    }
}
