package practice_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {

    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                // happy path: "sasha" -> "ahsas"
                Arguments.of("sasha", "ahsas"),
                // corner cases: "" -> ""
                Arguments.of("", ""),
                // corner cases: "a" -> "a"
                Arguments.of("a", "a")
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        String actualString = processor.reverse(initialString);

        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    public void userCannotReverseNullString() {
        String initialString = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> processor.reverse(initialString));
    }

}
