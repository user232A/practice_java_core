package practice_5.treeset_tasks;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task3 {
    // Найдите ближайшее большее и меньшее число к заданному в TreeSet.

    public int getLargerNumber(TreeSet<Integer> treeSet, int number){
        SortedSet<Integer> integers = treeSet.tailSet(number);
        return integers.last();
    }

    public int getLessNumber(TreeSet<Integer> treeSet, int number){
        SortedSet<Integer> integers = treeSet.headSet(number);
        return integers.first();
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        TreeSet<Integer> tresSet = new TreeSet<>();

        tresSet.add(4);
        tresSet.add(44);
        tresSet.add(46);
        tresSet.add(94);
        tresSet.add(52);
        tresSet.add(16);
        tresSet.add(9);

        System.out.println(tresSet);

        System.out.println(task3.getLargerNumber(tresSet, 16));
        System.out.println(task3.getLessNumber(tresSet, 52));
    }
}
