package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

@DisplayName("Checking the correctness of the password")
public class PasswordTest extends MainProcessorTest {

    @Test
    public void userCanCheckValidPassword() {
        String password = "Password1";
        Assertions.assertTrue(processor.isValidPassword(password));
    }

    @Test
    public void userCanCheckInvalidPassword() {
        String password = "Pass";
        Assertions.assertFalse(processor.isValidPassword(password));
    }

    @Test
    public void userCannotCheckPasswordWithNull() {
        String password = null;
        Assertions.assertFalse(processor.isValidPassword(password));
    }
}
