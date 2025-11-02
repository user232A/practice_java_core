package complex_tasks.validator;

public class Main {
    public static void main(String[] args) throws InvalidUserException {

        User marina = new User("Marina", 25, "marina@gmail.com");
        User bob = new User("bob", 29, "bobgmail.com");
        User john = new User("John", -25, "marina@gmail.com");

        UserValidator.enableValidation();
        try {
            System.out.println("Is correct name: " + marina.getName() + " - " +
                    UserValidator.isNameCorrect(marina.getName()));
        } catch (InvalidUserException e) {
            System.out.println("Error, name is invalid");
        }
        try {
            System.out.println("Is correct age " + marina.getAge() + " - " +
                    UserValidator.isAgeCorrect(marina.getAge()));
        } catch (InvalidUserException e) {
            System.out.println("Error, age is invalid");
        }
        try {
            System.out.println("Is correct email " + marina.getEmail() + " - " +
                    UserValidator.isEmailCorrect(marina.getEmail()));
        } catch (InvalidUserException e) {
            System.out.println("Error, email is invalid");
        }
        System.out.println();

        try {
            System.out.println("Is correct name: " + bob.getName() + " - " +
                    UserValidator.isNameCorrect(bob.getName()));
        } catch (InvalidUserException e) {
            System.out.println("Error, name is invalid");
        }
        try {
            System.out.println("Is correct age " + bob.getAge() + " - " +
                    UserValidator.isAgeCorrect(bob.getAge()));
        } catch (InvalidUserException e) {
            System.out.println("Error, age is invalid");
        }
        try {
            System.out.println("Is correct email " + bob.getEmail() + " - " +
                    UserValidator.isEmailCorrect(bob.getEmail()));
        } catch (InvalidUserException e) {
            System.out.println("Error, email is invalid");
        }
        System.out.println();

        try {
            System.out.println("Is correct name: " + john.getName() + " - " +
                    UserValidator.isNameCorrect(john.getName()));
        } catch (InvalidUserException e) {
            System.out.println("Error, name is invalid");
        }
        try {
            System.out.println("Is correct age: " + john.getAge() + " - " +
                    UserValidator.isAgeCorrect(john.getAge()));
        } catch (InvalidUserException e) {
            System.out.println("Error, age is invalid");
        }
        try {
            System.out.println("Is correct email " + john.getEmail() + " - " +
                    UserValidator.isEmailCorrect(john.getEmail()));
        } catch (InvalidUserException e) {
            System.out.println("Error, email is invalid");
        }

        System.out.println();

        UserValidator.disableValidation();
        System.out.println("Validation disabled");

        try {
            System.out.println("Is correct name: " + marina.getName() + " - " +
                    UserValidator.isNameCorrect(marina.getName()));
        } catch (InvalidUserException e) {
            System.out.println("Error, name is invalid");
        }
    }
}
