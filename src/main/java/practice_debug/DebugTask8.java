package practice_debug;

public class DebugTask8 {

    // Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.

    public static void main(String[] args) {
        //double a = 0.1 * 3;
        double a = 0.1;
        double b = 0.3;

        a = Math.round((a * 3) * 100.0) / 100.0;

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}