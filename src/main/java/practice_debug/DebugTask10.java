package practice_debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {

    // Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        System.out.println(names);

        /*
         * for (String name : names) {
         *    if (name.startsWith("A")) {
         *        names.remove(name);
         *    }
         */

        names.removeIf(s -> s.startsWith("A"));
        System.out.println(names);
    }
}

