package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Check valid email")
public class ValidEmailTest extends MainProcessorTest {

    @ParameterizedTest
    @CsvSource({"example@gmail.com", "ejemplo@mail.ru", "test1@gmail.com", "1969@gmail.com"})
    public void userCanCheckValidEmail(String email) {
        Assertions.assertTrue(processor.isValidEmail(email));
    }

    @ParameterizedTest
    @CsvSource({"examplegmail.com", "ejemplo@mailru", "test1@gmail.", "@gmail.com"})
    public void userCanCheckNotValidEmail(String email) {
        Assertions.assertFalse(processor.isValidEmail(email));
    }

    @Test
    public void userCannotCheckValidEmailWithNull() {
        Assertions.assertFalse(processor.isValidEmail(null));
    }
}
