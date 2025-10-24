package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Reverse string test")
public class ReverseStringTest extends MainProcessorTest {

    @Test
    public void userCanReverseString() {
        String initialString = "Paris";
        String expectedString = "siraP";
        Assertions.assertEquals(expectedString, processor.reverse(initialString));
    }

    @Test
    public void userCanReverseEmptyString() {
        String initialString = "";
        String expectedString = "";
        Assertions.assertEquals(expectedString, processor.reverse(initialString));
    }

    @Test
    public void userCanReverseNullString() {
        String initialString = null;
        String expectedString = null;
        Assertions.assertEquals(expectedString, processor.reverse(initialString));
    }
}
