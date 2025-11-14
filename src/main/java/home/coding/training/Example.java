package home.coding.training;

import java.util.*;

public class Example {

    public static Map<String, Integer> getWordFrequency(String str){
        Map<String, Integer> map = new HashMap<>();
        for (String word: str.trim().split("[\\s]+")){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }




    public static void main(String[] args) {

        //System.out.println(Arrays.toString(getUniqueWords("juice mango mango orange", "apple banana orange")));
        //System.out.println(isPalindrome(" no!!N"));
        //System.out.println(countWords("wdwe weewf wrv 45dcvew vr, erte"));
        getWordFrequency("orange apple sky orange orange banana banana home fly home car car car")
        .forEach((x, y) -> System.out.println("Word " + x + " - value " + y));
        //System.out.println(Arrays.toString(getUniqueWords("orange apple sky orange orange",
        //"banana banana home fly home car car car")));
        //System.out.println(isPalindrome("Ann !a"));
        //System.out.println(findMaxElement(new int[]{4, 81, 9, 10, 55}));
        //System.out.println(findSecondMaxElement(new int[]{4, 81, 9, 10, 55, 65}));
        //System.out.println(Arrays.toString(removeDuplicatesFromArray(new int[]{4, 81, 4, 65, 9, 10, 55, 65})));
        //System.out.println(countVowels("panama"));
        //System.out.println(maxSubArray(new int[]{5, 8, 1, 4, 7, 6}, 3));
        //System.out.println(findMaxElement(new int[]{5, 8, 10, 4, 7, 6}));

    }
}
