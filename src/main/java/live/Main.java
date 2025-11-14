package live;

import java.util.*;

public class Main {

    // 1. Подсчет частоты слов в строке

    public static Map<String, Integer> frequencyCount(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : str.trim().split("[\\s\\W\\d]+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    // 2. Поиск максимума в массиве

    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) max = number;
        }
        return max;
    }

    // 3. Удаление дубликатов из списка

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    // 4. Найти в массиве max сумму подмассива длиной k

    public static int findMaxSubArray(int[] array, int k) {
        int max = 0;
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

    // 5. Проверка на палиндром

    public static boolean isPalindrome(String str) {
        String modifiedString = str.trim().replaceAll("[\\s\\W\\d]+", "").toLowerCase();
        return new StringBuilder(modifiedString).reverse().toString().equals(modifiedString);
    }

    public static void main(String[] args) {
        frequencyCount("home orange home apple, potato 1car car apple")
                .forEach(((string, integer) -> System.out.println("Key: " + string + " Value: " + integer)));

        System.out.println(findMaxElement(new int[]{5, 4, 17, 20, 15, 81, 16}));
        System.out.println(removeDuplicates(List.of(5, 5, 1, 9, 8, 8, 11)));
        System.out.println(findMaxSubArray(new int[]{5, 4, 17, 20, 15, 81, 16}, 3));
        System.out.println(isPalindrome("An14 /na"));
    }
}
