package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

@DisplayName("Finding the second largest number in an array")
public class FindSecondTest extends MainProcessorTest {

    @Test
    public void userCanFindSecondMaxValue() {
        int[] array = {5, 8, 16, 87, 64, 18, 63, 88};
        int expectedValue = 87;
        Assertions.assertEquals(expectedValue, processor.findSecondMaxCustom(array));
    }

    @Test
    public void userCanFindSecondMaxValueWithSameNumbers() {
        int[] array = {5, 8, 16, 87, 64, 18, 63, 88, 5, 87, 16};
        int expectedValue = 87;
        Assertions.assertEquals(expectedValue, processor.findSecondMaxCustom(array));
    }

    @Test
    public void userCannotFindSecondMaxValueWithOneElement() {
        int[] array = {5};
        Assertions.assertThrows(NoSuchElementException.class, () -> processor.findSecondMaxCustom(array));
    }
}
