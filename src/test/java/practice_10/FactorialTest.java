package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Find factorial of a number")
public class FactorialTest extends MainProcessorTest {

    @Test
    public void userCanCheckZeroEqualsOne() {
        int initialValue = 0;
        int expectedValue = 1;
        Assertions.assertEquals(expectedValue, processor.factorial(initialValue));
    }

    @Test
    public void userCanCheckWithValueOne() {
        int initialValue = 1;
        int expectedValue = 1;
        Assertions.assertEquals(expectedValue, processor.factorial(initialValue));
    }

    @Test
    public void userCanCheckWithValueFive() {
        int initialValue = 5;
        int expectedValue = 120;
        Assertions.assertEquals(expectedValue, processor.factorial(initialValue));
    }

    @Test
    public void userCanCheckWithValueSEVEN() {
        int initialValue = 7;
        int expectedValue = 5040;
        Assertions.assertEquals(expectedValue, processor.factorial(initialValue));
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, -9, -15, -94})
    public void userCannotCheckWithNegativeValue(int value) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> processor.factorial(value));
    }
}
