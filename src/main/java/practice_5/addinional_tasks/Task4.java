package practice_5.addinional_tasks;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    // Учёт посещений страниц
    // 4. Задача:
    // Отслеживать уникальные страницы и общее количество посещений.

    Set<String> set = new HashSet<>();
    int count = 0;

    public void addPage(String url){
        set.add(url);
        count++;
    }

    public void info(){
        System.out.println("Unic visits: " + set.size());
        System.out.println("All visits: " + count);
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.addPage("https://avito.ru");
        task4.addPage("https://avito.ru");
        task4.addPage("https://gismeteo.ru");
        task4.addPage("https://tesla.ru");
        task4.addPage("https://avito.ru");
        task4.addPage("https://google.com");
        task4.addPage("https://google.com");
        task4.addPage("https://gm.ru");

        task4.info();
    }
}
