package practice_3;

public class Main {

    public static void main(String[] args) {
        IfElseSolver ifElseSolver = new IfElseSolver();
    /*
        // 1. Определение знака числа

        System.out.println(ifElseSolver1.checkNumber());
        System.out.println();

    */

        // 2. Поиск наибольшего из двух чисел

        int maxNumber = ifElseSolver.maxNumber(23, 12);
        System.out.println("Max number is " + maxNumber);
        System.out.println();

        // 3. Вывод оценки по шкале 1–5

        /*

       ifElseSolver1.checkGrade();

        */

        // 4. Проверка на чётность

        // ifElseSolver1.checkEven();

        // 5. Определение размера скидки по возрасту

        //ifElseSolver1.getDiscount();

        // 6. Оценка результата теста по баллам

        ifElseSolver.getTestResults();
    }
}
