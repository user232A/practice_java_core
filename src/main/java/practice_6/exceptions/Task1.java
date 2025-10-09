package practice_6.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    // 1. Обработка проверяемого исключения
    // Условие задачи:
    // Напишите программу, которая пытается открыть файл с именем "data.txt".
    // Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".

    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Такого файла нет " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия " + e.getMessage());
            }
        }
    }
}
