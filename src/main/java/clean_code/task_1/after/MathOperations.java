package clean_code.task_1.after;

import java.util.Arrays;

public class MathOperations {

    public int addNumbers(int... number) {
        return Arrays.stream(number).sum();
    }

    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println(operations.addNumbers(1, 2, 3, 4));
    }
}
