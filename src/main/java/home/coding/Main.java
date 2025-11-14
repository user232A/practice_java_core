package home.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    public static void main(String[] args) {
        String s1 = "apple orange potato onion";
        String s2 = "apple mango potato juice";

        System.out.println(getUniqueWords(s1, s2));


    }
}
