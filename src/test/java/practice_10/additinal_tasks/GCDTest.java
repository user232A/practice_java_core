package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

@DisplayName("Finding the greatest common divisor")
public class GCDTest extends MainProcessorTest {

    @Test
    public void userCanFindGCDWithTwoDigitNumber() {
        int firstValue = 24;
        int secondValue = 36;
        int expectedValue = 12;
        Assertions.assertEquals(expectedValue, processor.gcd(firstValue, secondValue));
    }

    @Test
    public void userCanFindGCDWithThirdDigitNumber() {
        int firstValue = 101;
        int secondValue = 103;
        int expectedValue = 1;
        Assertions.assertEquals(expectedValue, processor.gcd(firstValue, secondValue));
    }

    @Test
    public void userCanFindGCDWithZeroNumber() {
        int firstValue = 0;
        int secondValue = 10;
        int expectedValue = 10;
        Assertions.assertEquals(expectedValue, processor.gcd(firstValue, secondValue));
    }
}
