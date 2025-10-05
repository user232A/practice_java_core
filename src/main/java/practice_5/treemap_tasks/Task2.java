package practice_5.treemap_tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    // Найдите минимальный и максимальный ключ в TreeMap.

    public static int getMaxKey(TreeMap<Integer, String> map){
        int max = 0;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getKey() > max){
                max = entry.getKey();
            }
        }
        return max;
    }

    public static int getMinKey(TreeMap<Integer, String> map){
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getKey() < min){
                min = entry.getKey();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(56, "Misha");
        map.put(522, "Masha");
        map.put(48, "Oleg");
        map.put(54, "Lena");
        map.put(44, "Fedor");
        map.put(4, "Fedor");

        System.out.println(getMaxKey(map));
        System.out.println(getMinKey(map));
    }
}
