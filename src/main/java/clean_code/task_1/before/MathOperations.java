package clean_code.task_1.before;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }
    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
    public int addFourNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println(operations.addFourNumbers(1,2,3,4));
    }
}
