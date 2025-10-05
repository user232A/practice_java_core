package practice_1;

public class MathConstants {

    final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r) {
        MathConstants mathConstants = new MathConstants();
        return 2 * mathConstants.PI * r * r;
    }

    static double calculateCircumference(double r) {
        MathConstants mathConstants = new MathConstants();
        return 2 * mathConstants.PI * r;
    }
}
