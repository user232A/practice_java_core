package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Check even number")
public class EvenTest extends MainProcessorTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 8, 16, 82, 100})
    public void userCanCheckValidNumberIsEven(int value) {
        Assertions.assertTrue(processor.isEven(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 33, 67, 101})
    public void userCanCheckValidNumberIsNotEven(int value) {
        Assertions.assertFalse(processor.isEven(value));
    }

    @Test
    public void userCanCheckZeroNumberIsEven() {
        int zero = 0;
        Assertions.assertTrue(processor.isEven(zero));
    }

    @ParameterizedTest
    @ValueSource(ints = {-4, -10, -50, -80, -110})
    public void userCanCheckValidNegativeNumberIsEven(int value) {
        Assertions.assertTrue(processor.isEven(value));
    }
}
