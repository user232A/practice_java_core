package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

@DisplayName("Find max element in array")
public class FindMaxTest extends MainProcessorTest {

    @Test
    public void userCanFindMaxValue() {
        int[] array = {57, 9, 42, 91, 63, 88, 22};
        int expectedValue = 91;
        Assertions.assertEquals(expectedValue, processor.findMax(array));
    }

    @Test
    public void userCanFindMaxValueWithOneElementArray() {
        int[] array = {22};
        int expectedValue = 22;
        Assertions.assertEquals(expectedValue, processor.findMax(array));
    }

    @Test
    public void userCanFindMaxValueWithNegativeNumbers() {
        int[] array = {-4, -64, -31, -55, -8, -67, -28};
        int expectedValue = -4;
        Assertions.assertEquals(expectedValue, processor.findMax(array));
    }

    @Test
    public void userCannotFindMaxValueWithEmptyArray() {
        int[] array = new int[0];
        Assertions.assertThrows(NoSuchElementException.class, () -> processor.findMax(array));
    }
}
