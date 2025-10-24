package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

import java.util.List;

@DisplayName("Filtering a list of numbers")
public class FilterEvenNumbersTest extends MainProcessorTest {

    @Test
    public void userCanFilterListEvenNumber() {
        List<Integer> list = List.of(5, 33, 94, 50, 8, 100, 77, 62);
        List<Integer> expectedList = List.of(94, 50, 8, 100, 62);
        Assertions.assertEquals(expectedList, processor.filterEvenNumbers(list));
    }

    @Test
    public void userCanFilterListWithoutEvenNumber() {
        List<Integer> list = List.of(5, 33, 97, 53, 99, 101, 77, 63);
        List<Integer> expectedList = List.of();
        Assertions.assertEquals(expectedList, processor.filterEvenNumbers(list));
    }

    @Test
    public void userCanFilterEmptyList() {
        List<Integer> list = List.of();
        List<Integer> expectedList = List.of();
        Assertions.assertEquals(expectedList, processor.filterEvenNumbers(list));
    }
}
