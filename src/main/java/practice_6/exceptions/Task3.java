package practice_6.exceptions;

public class Task3 {
    // 3. Создание и использование собственного проверяемого исключения
    // Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
    // Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.

    public static void checkAge(int age) throws InvalidAgeException {
        if (age >= 0 && age <= 150) {
            System.out.println(age);
        } else {
            throw new InvalidAgeException("Invalid age");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(156);
        } catch (InvalidAgeException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
