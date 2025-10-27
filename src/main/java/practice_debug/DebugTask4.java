package practice_debug;

public class DebugTask4 {

    // Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
