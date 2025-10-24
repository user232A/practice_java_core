package practice_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("class StringProcessor, method validateLength")
public class ValidateLengthTest extends StringProcessorTest {

    @ParameterizedTest
    @CsvSource({
            "paris, 5",
            "london, 4",
            "madrid, 0"
    })
    public void userCanCheckValidStringLengthMoreOrEqualToMinValue(String initialString, int value) {
        String actualString = processor.validateLength(initialString, value);
        Assertions.assertEquals(initialString, actualString);
    }

    @ParameterizedTest
    @CsvSource({
            "paris, 6",
            "london, 7",
            "madrid, 9"
    })
    public void userCanCheckValidStringLengthLessToMinValue(String initialString, int value) {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> processor.validateLength(initialString, value));
    }

    @Test
    public void userCannotCheckNullStringLength() {
        String initialString = null;
        int minValue = 5;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> processor.validateLength(initialString, minValue));
    }
}
