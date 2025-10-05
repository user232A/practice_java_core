package practice_5.addinional_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task8 {
    // Уникальные слова в тексте
    // 8.Задача
    // Получить все уникальные слова и их количество.

    Set<String> stringSet = new HashSet<>();

    public void countUnicString(String s){
        String[] split = s.split(" ");
        stringSet.addAll(Arrays.asList(split));
        System.out.println("Количество уникальных слов: " + stringSet.size());
    }

    public static void main(String[] args) {
        Task8 task8 = new Task8();

        String sequenceNotUnicString = "кот собака кот птица собака мышь кот";

        task8.countUnicString(sequenceNotUnicString);
        for (String element : task8.stringSet){
            System.out.print(element + " ");
        }
    }
}
