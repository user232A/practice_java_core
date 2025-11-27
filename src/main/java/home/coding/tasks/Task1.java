package home.coding.tasks;

import java.util.*;

public class Task1 {

    /*
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null && getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return this.name.equals.that.name && this.age.equals(that.age);
    }
     */

    /*
     1. Получить массив уникальных строк
     Логика решения: Сравнить строку с ее реверсивной копией
     */

    public static String[] getUniqueWords(String str1, String str2){
        String[] strings = str1.concat(" " + str2).trim().split("[\\s]+");
        Map<String, Integer> map = new HashMap<>();
        for (String word: strings){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).toArray(String[]::new);
    }

    /*
     2. Проверить является ли строка палиндромом
     Логика решения: Сравнить строку с ее реверсивной копией
     */

    public static boolean isPalindrome(String word) {
        if (word == null) {
            throw new NullPointerException("Word is null");
        }
        String replaced = word.replaceAll("[\\s\\W]+", "").toLowerCase();
        return new StringBuilder(replaced).reverse().toString().equals(replaced);
    }

    /*
     3. Посчитать сумму всех чисел в массиве.
     Логика решения: Пройтись циклом по массиву и накопить сумму
     */

    public static int sumNumbers(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Argument is incorrect");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /*
     4. Наибольшее число в массиве
     Логика решения: Инициализировать максимум первым элементом и сравнивать с остальными
     */

    public static int maxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /*
     5. Проверка на простое число
     Логика решения: Проверить делимость от 2 до sqrt(n)
     */

    public static boolean isSimpleNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     6. Факториал числа
     Логика решения: использовать цикл от 1 до n
     */

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    /*
     7. Подсчитать кол-во гласных букв в строке
     Логика решения: пройтись по строке и проверить каждый символ
     */

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiouуеэоаыиюя".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    /*
     8. Поиск второго максимального элемента
     Логика решения: Поддерживать два значения - максимум и второй максимум
     */

    public static int getSecondMaxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                second = max;
                max = number;
            } else if (number > second && number != max) {
                second = number;
            }
        }
        return second;
    }

    /*
     9. Проверить являются ли две строки анаграммами друг друга (Анаграмма - это слово или фраза, образованная
        перестановкой букв другого слова или фразы.)
     Логика решения: Отсортировать символы строк и сравнить
     */

    public static boolean isAnagram(String str1, String str2) {
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        return Arrays.equals(str1CharArray, str2CharArray);
    }

    /*
     10. Подсчет слов в сторке
     Логика решения: Разбить строку по пробелам и подсчитать длину массива
     */

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("[\\s]+").length;
    }

    /*
     11. Сумма значений в списке
     Логика решения: Пройтись по списку и суммировать значения
     (Не стал делать т.к. легко)
     */

    /*
     12. Проверка уникальности элементов
     Логика решения: Использовать set для проверки повторов
     */

    public static boolean isUnique(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int element : array) {
            if (!set.add(element)) {
                return false;
            }
        }
        return true;
    }

    /*
     14. Обработка деления на 0
     Логика решения: try-catch блок и возврат по-умолчанию
     */

    public static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    /*
     16. Удаление дубликатов из списка
     Логика решения: Сконвертировать в Set и обратно в List
     */

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    /*
     17. Фильтрация нечетных чисел
     Логика решения: Использовать Stream и filter
     */

    public static List<Integer> filterOdds(List<Integer> list) {
        return list.stream().filter(n -> n % 2 != 0).toList();
    }

    /*
     19. Проверка корректности скобочной последовательности
     Логика решения: Использовать стек для отслеживания открывающих и закрывающих скобок
     */

    public static boolean isBalanced(String str) {
        int balance = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    /*
     20. Проверка является ли строка числом
     Логика решения: Использовать Integer.parseInt с try/catch
     */

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
     21. Слияние двух списков
     Логика решения: Создать новый список и добавить все элементы
     */

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> integers = new ArrayList<>(list1);
        integers.addAll(list2);
        return integers;
    }

    /*
     25. Кокатенация строк через StringBuilder
     Логика решения: Пройтись по массиву и собрать через StringBuilder
     */

    public static String join(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    /*
     26. Поиск частоты слов в строке
     Логика решения: Разбить строку и использовать Map
     */

    public static Map<String, Integer> wordFrequency(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : str.trim().split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    /*
     N. Поиск max суммы подмассива длинной K (3)
     [12, 20, 50, 32, 55, 10] -> 137
     Уточняющие вопросы
     Логика решения:
     Сначала считаем сумму первых k элементов.
     
     */

    public static int findSumSubArray(int[] array, int k) {
        if (array == null || k > array.length) {
            throw new IllegalArgumentException("Invalid argument");
        }

        int max;
        int sum = 0;

        int first = 0;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        max = sum;

        for (int i = k; i < array.length; i++) {
            sum = sum - array[first] + array[i];
            if (sum > max) max = sum;
            first++;
        }
        return max;
    }

    /*
    42. Реализация метода startsWith
    Логика: посимвольное сравнение
    Corner case: один символ, prefix все слово
     */

    public static boolean isStartsWith(String word, String prefix){
        String replaced = word.trim().replaceAll("[\\W\\d]+", "");
        for (int i = 0; i < prefix.length(); i++) {
            if (word.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }

    /*
    52. Подсчитать кол-во нечетных чисел в массиве
    Логика:
    Corner case:
     */

    public static int countOdds(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int number: array){
            if (number % 2 != 0){
                list.add(number);
            }
        }
        return list.size();
    }


    public static void main(String[] args) {

        // 2. Palindrome
        System.out.println(isPalindrome("No! ^-*n"));

        // 3. Sum numbers
        System.out.println(sumNumbers(new int[]{7, -9}));

        // 4. Max element
        System.out.println(maxElement(new int[]{5, 8, 12, 18}));

        // 5. Simple number
        System.out.println(isSimpleNumber(61));

        // 6. Factorial
        System.out.println(factorial(5));

        // 7. Count vowels
        System.out.println(countVowels("astra"));

        // 8. Second max
        System.out.println(getSecondMaxElement(new int[]{1, 9, 7, 91}));

        // 9. Anagram
        System.out.println(isAnagram("listen", "silent"));

        // 10.
        System.out.println(countWords("wcewi oiweciew oiwewen nweicio48  e3id iwvwe ewfwe"));

        // 25.
        System.out.println(join(new String[]{"abba", "qwerty"}));

        //N
        System.out.println(findSumSubArray(new int[]{1, 9, 7, 10, 20}, 3));

    }
}
