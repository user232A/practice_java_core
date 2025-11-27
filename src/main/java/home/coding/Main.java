package home.coding;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    /*
    Получить список всех уникальных слов в сумме двух строк

    Шаг 1:
    Дано 2 строки
    "banana apple mango juice"
    "house banana java"

    Ответ: все уникальные слова в сумме двух строк
    ["apple","mango","house","java"]

    Шаг 2:
    Алгоритм решения
    - Конкатенация строк и разбивка строки на массив строк по пробелу
    - Проходим по массиву: Если в мапе еще нет - добавляем слово - 1, если есть обновляем значение
    - Пройтись по мапе и если значение 1, то добавляем ключ в list

     */

    public static List<String> getUniqueWords(String str1, String str2){
        String[] strings = str1.concat(" " + str2).split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word: strings){
            if (!map.containsKey(word)){
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).toList();
    }

    public static boolean isStartsWith(String word, String prefix){
        String replaced = word.trim().replaceAll("[\\W\\d]+", "");
        for (int i = 0; i < prefix.length(); i++) {
            if (word.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }

    public static boolean isUniqueNumbers(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int number: array){
            if (!set.add(number)) return false;
        }
        return true;
    }


    public static void main(String[] args) throws InterruptedException {
        //String s1 = "apple orange potato onion";
        //String s2 = "apple mango potato juice";

        //System.out.println(getUniqueWords(s1, s2));
        //System.out.println(isStartsWith("anna", "anna"));

        /*
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("E");
        }
        finally {
            System.out.println("F");
        }


        String s = "a";
        s.concat("b");
        System.out.println(s);
         */

        /*
        boolean r = Stream.of("a", "b", "c")
                .peek(System.out::print)
                .anyMatch("b"::equals);
        System.out.println(r);

         */

        StringBuilder sb = new StringBuilder();
        Thread thread1 = new Thread(() -> sb.append("A"));
        Thread thread2 = new Thread(() -> sb.append("B"));

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println(sb.toString());

    }


}
