package mock.algo_task;

public class Main {

    /*
    "apple" -> false
    "app le" -> false
    "12464" -> true
    "" -> false
    null -> false

     */

    public static boolean isContainsNumber(String str){
        if (str == null || str.isEmpty()){
            return false;
        }
        String replaced = str.trim().replaceAll("[\\s\\W]+", "");
        try {
            int number = Integer.parseInt(replaced);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isContainsNumber("12464"));
        System.out.println(isContainsNumber("124 64"));
        System.out.println(isContainsNumber("apple"));
        System.out.println(isContainsNumber(""));
        System.out.println(isContainsNumber(null));
    }

}
