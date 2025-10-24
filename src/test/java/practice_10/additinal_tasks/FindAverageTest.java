package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

import java.util.NoSuchElementException;

@DisplayName("Finding the mean of an array of numbers")
public class FindAverageTest extends MainProcessorTest {

    @Test
    public void userCanFindAverageValueInValidArray() {
        int[] array = {5, 8, 7, 10, 15};
        double expectedResult = 9.0;
        Assertions.assertEquals(expectedResult, processor.findAverage(array));
    }

    @Test
    public void userCanFindAverageValueInArrayWithOneElement() {
        int[] array = {15};
        double expectedResult = 15.0;
        Assertions.assertEquals(expectedResult, processor.findAverage(array));
    }

    @Test
    public void userCannotFindAverageValueEmptyArray() {
        Assertions.assertThrows(NoSuchElementException.class, () -> processor.findAverage(new int[0]));
    }
}
