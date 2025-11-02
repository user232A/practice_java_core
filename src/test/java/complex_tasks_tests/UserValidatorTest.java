package complex_tasks_tests;

import complex_tasks.validator.InvalidUserException;
import complex_tasks.validator.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"John", "Bob", "David"})
    public void canCheckCorrectName(String name) throws InvalidUserException {
        UserValidator.enableValidation();
        Assertions.assertTrue(UserValidator.isNameCorrect(name));
        UserValidator.disableValidation();
    }

    @Test
    public void canCheckIncorrectName() {
        String emptyName = "";
        UserValidator.enableValidation();
        Assertions.assertThrows(InvalidUserException.class, () -> UserValidator.isNameCorrect(emptyName));
        UserValidator.disableValidation();
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 99, 50})
    public void canCheckCorrectAge(int age) throws InvalidUserException {
        UserValidator.enableValidation();
        Assertions.assertTrue(UserValidator.isAgeCorrect(age));
        UserValidator.disableValidation();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 18, 100, 101, -20})
    public void canCheckIncorrectAge(int age) {
        UserValidator.enableValidation();
        Assertions.assertThrows(InvalidUserException.class, () -> UserValidator.isAgeCorrect(age));
        UserValidator.disableValidation();
    }

    @ParameterizedTest
    @ValueSource(strings = {"example@mail.ru", "ejemplo@gmail.com", "marina@gmail.com"})
    public void canCheckCorrectEmail(String email) throws InvalidUserException {
        UserValidator.enableValidation();
        Assertions.assertTrue(UserValidator.isEmailCorrect(email));
        UserValidator.disableValidation();
    }

    @ParameterizedTest
    @ValueSource(strings = {"examplemail.ru", "ejemplo@.com", "marina@gmailcom", "test1@mail."})
    public void canCheckIncorrectEmail(String email) {
        UserValidator.enableValidation();
        Assertions.assertThrows(InvalidUserException.class, () -> UserValidator.isEmailCorrect(email));
        UserValidator.disableValidation();
    }
}
