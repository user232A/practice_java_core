package home.coding.training;

import java.util.*;

public class Example {

    // Подсчет слов в строке

    public static int countWords(String str) {
        return str.trim().split("[\\s\\W\\d]+").length;
    }

    /*
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null && getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return this.name.equals.that.name && this.age.equals(that.age);
    }
     */

    public static String concatWords(String[] array){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static boolean isBalanced(String str){
        int balance = 0;
        for (char c: str.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
        }
        return balance == 0;
    }


    public static int countOdds(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int number : array) {
            if (number % 2 != 0) {
                list.add(number);
            }
        }
        return list.size();
    }

    public static int maxSubArray(int[] array, int k){
        int max = 0;
        int sum = 0;
        int first = 0;
        int second = k;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        max = sum;

        for (int i = second; i < array.length; i++) {
            sum = sum - array[first] + array[i];
            if (sum > max) max = sum;
            first++;
        }
        return max;
    }


    public static void main(String[] args) {

        //System.out.println(Arrays.toString(getUniqueWords("juice mango mango orange", "apple banana orange")));
        //System.out.println(isPalindrome("1 no!!N"));
        //System.out.println(countWords("we wdwe weewf wrv 45dcvew vr erte"));
        //getWordFrequency("orange apple sky orange orange banana banana home fly home car car car")
        //.forEach((x, y) -> System.out.println("Word " + x + " - value " + y));
        //System.out.println(Arrays.toString(getUniqueWords("orange apple sky orange orange",
        //"banana banana home fly home car car car")));
        //System.out.println(findMaxElement(new int[]{4, 81, 9, 10, 55}));
        //System.out.println(findSecondMaxElement(new int[]{4, 81, 9, 10, 55, 65}));
        //System.out.println(Arrays.toString(removeDuplicatesFromArray(new int[]{4, 81, 4, 65, 9, 10, 55, 65})));
        //System.out.println(countVowels("panama"));
        //System.out.println(maxSubArray(new int[]{5, 8, 10, 4, 7, 6}, 3));
        //System.out.println(findMaxElement(new int[]{5, 8, 10, 4, 7, 6}));
        //System.out.println(minValue(new int[]{4, 81, 9, 10, 2}));
        //System.out.println(removeDuplicatesFromList(List.of(5, 9, 9, 4, 4, 1, 7)));
        //System.out.println(isSimple(5));
        //System.out.println(isAnagram("апел 1ьс%ин", "спаниель"));
        //System.out.println(countOdds(new int[]{4, 81, 9, 10, 2, 11}));
        //System.out.println(isBalanced("((()))"));
    }
}
