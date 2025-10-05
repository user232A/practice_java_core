package practice_5.hashset_tasks;

import java.util.*;

public class Task1 {
    //Создайте HashSet из 5 чисел и выведите его содержимое.

    public Integer[] getListInteger(Set<Integer> set){
        return set.toArray(set.toArray(new Integer[0]));
    }

    public void info(Integer[] array){
        for(Integer number : array){
            System.out.print(number + " ");
        }
    }

    public void getElements(Set<Integer> set){
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(78);
        set.add(85);
        set.add(85);
        set.add(31);
        set.add(92);

        Integer[] listInteger = task1.getListInteger(set);
        task1.info(listInteger);

        System.out.println();

        task1.getElements(set);
    }
}
