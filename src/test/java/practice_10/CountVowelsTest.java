package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Count vowels test")
public class CountVowelsTest extends MainProcessorTest {

    @ParameterizedTest
    @ValueSource(strings = {"hello", "java"})
    public void userCanCheckCountVowels(String word) {
        int expectedValue = 2;
        Assertions.assertEquals(expectedValue, processor.countVowels(word));
    }

    @Test
    public void userCanCheckCountWithFiveVowels() {
        int expectedValue = 5;
        String word = "AEIOU";
        Assertions.assertEquals(expectedValue, processor.countVowels(word));
    }

    @Test
    public void userCanCheckCountWithEmptyString() {
        int expectedValue = 0;
        String word = "";
        Assertions.assertEquals(expectedValue, processor.countVowels(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"rtqxc", "lrpthm", "tnbzqp, pllsfr"})
    public void userCanCheckCountWithoutVowels(String word) {
        int expectedValue = 0;
        Assertions.assertEquals(expectedValue, processor.countVowels(word));
    }

    @Test
    public void userCannotCheckWithNullCountVowels() {
        String word = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> processor.countVowels(word));
    }
}
