package practice_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("class StringProcessor, method isPalindrome")
public class PalindromeTest extends StringProcessorTest {

    @ParameterizedTest
    @ValueSource(strings = {"abba", "hah", "a", ""})
    public void userCanCheckValidStringIsPalindrome(String initialString) {
        Assertions.assertTrue(processor.isPalindrome(initialString));
    }

    @Test
    public void userCannotCheckIfValidStringIsNotPalindrome() {
        String initialString = "paris";
        Assertions.assertFalse(processor.isPalindrome(initialString));
    }

    @Test
    public void userCannotCheckNullStringIsPalindrome() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> processor.isPalindrome(null));
    }
}
