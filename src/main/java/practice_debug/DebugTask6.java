package practice_debug;

public class DebugTask6 {

    // Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.

    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
        //countdown(n - 1);
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
