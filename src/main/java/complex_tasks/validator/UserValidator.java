package complex_tasks.validator;

public class UserValidator {

    public static boolean validationEnabled = false;

    public static void disableValidation() {
        validationEnabled = false;
    }

    public static void enableValidation() {
        validationEnabled = true;
    }

    public static boolean isNameCorrect(String name) throws InvalidUserException {
        if (name.isEmpty()) {
            throw new InvalidUserException("Name is incorrect");
        }
        if (validationEnabled) {
            if (Character.isUpperCase(name.charAt(0))) {
                return true;
            } else {
                throw new InvalidUserException("Name is invalid");
            }
        }
        return false;
    }

    public static boolean isAgeCorrect(int age) throws InvalidUserException {
        if (age <= 0) {
            throw new InvalidUserException("Age is incorrect");
        }
        if (validationEnabled) {
            if (age > 18 && age < 100) {
                return true;
            } else {
                throw new InvalidUserException("Age is invalid");
            }
        }
        return false;
    }

    public static boolean isEmailCorrect(String email) throws InvalidUserException {
        if (email.isEmpty()) {
            throw new InvalidUserException("Age is incorrect");
        }
        if (validationEnabled) {
            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                return true;
            } else {
                throw new InvalidUserException("Email is invalid");
            }
        }
        return false;
    }
}
