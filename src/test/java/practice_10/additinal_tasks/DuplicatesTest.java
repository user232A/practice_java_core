package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

@DisplayName("Checking if an array contains duplicates")
public class DuplicatesTest extends MainProcessorTest {

    @Test
    public void userCanCheckValidArrayWithoutDuplicates() {
        int[] array = {1, 5, 7, 9, 10, 55};
        Assertions.assertFalse(processor.hasDuplicates(array));
    }

    @Test
    public void userCanCheckValidArrayWithDuplicates() {
        int[] array = {1, 5, 7, 9, 10, 55, 55, 1, 5};
        Assertions.assertTrue(processor.hasDuplicates(array));
    }

    @Test
    public void userCanCheckEmptyArray() {
        int[] array = new int[0];
        Assertions.assertFalse(processor.hasDuplicates(array));
    }
}
