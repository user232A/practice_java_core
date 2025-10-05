package practice_2;

public class TaskSolverPractice {

    public String checkAge(int age) {
        String ageDescription;
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        } else if (age >= 18 && age < 60) {
            ageDescription = "Взрослый";
        } else {
            ageDescription = "Несовершеннолетний";
        }
        return ageDescription;
    }

    public void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public boolean checkNumberIsSimple(int number) {
        boolean isSimple = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public void printAllSimpleNumbers(int number) {
        for (int i = 2; i < number; i++) {
            if (checkNumberIsSimple(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public int sumDigits(int number){

        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}

//TODO Программа выводит все простые числа от 1 до 100

