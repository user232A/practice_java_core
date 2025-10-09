package practice_6.additional_tasks;

import java.util.ArrayList;
import java.util.List;

public class MethodT {
    // Обобщённый метод
    //Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.

    public <T> void printList(List<T> list){
        for (T element : list){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        MethodT methodT = new MethodT();
        List<String> stringList = new ArrayList<>();
        List<Boolean> booleanList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        stringList.add("Paris");
        stringList.add("London");
        stringList.add("Berlin");
        stringList.add("Rome");
        stringList.add("Madrid");
        stringList.add("New-York");

        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(false);
        booleanList.add(true);

        integerList.add(45);
        integerList.add(17);
        integerList.add(94);
        integerList.add(55);
        integerList.add(941);

        methodT.printList(stringList);
        System.out.println();

        methodT.printList(booleanList);
        System.out.println();

        methodT.printList(integerList);
    }
}
