package practice_5.arraylist_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    // Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

    public String maxString(List<String> list) {
        int index = 0;
        int length = 0;

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).length();
            if (list.get(i).length() > length) {
                length = temp;
                index = i;
            }
        }
        return list.get(index);
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        List<String> list = new ArrayList<>();
        list.add("привет");
        list.add("хорошо");
        list.add("времяпрепровождение");
        list.add("отлично");
        list.add("бег");
        list.add("превосходящий");
        list.add("спорт");
        list.add("пример");

        System.out.println(task3.maxString(list));
    }
}
