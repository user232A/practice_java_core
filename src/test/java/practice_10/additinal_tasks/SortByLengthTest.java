package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Sorting a list of strings by length")
public class SortByLengthTest extends MainProcessorTest {

    @Test
    public void userCanSortListByLength() {
        List<String> initialList = new ArrayList<>() {{
            add("Helsinki");
            add("Monaco");
            add("Madrid");
            add("Paris");
            add("Oslo");
        }};
        List<String> expectedList = List.of("Oslo", "Paris", "Monaco", "Madrid", "Helsinki");
        Assertions.assertEquals(expectedList, processor.sortByLength(initialList));
    }

    @Test
    public void userCanSortListWithEqualLength() {
        List<String> initialList = new ArrayList<>() {{
            add("cc");
            add("bb");
            add("aa");
        }};
        List<String> expectedList = List.of("cc", "bb", "aa");
        Assertions.assertEquals(expectedList, processor.sortByLength(initialList));
    }

    @Test
    public void userCannotSortByLengthWithEmptyList() {
        List<String> initialList = List.of();
        List<String> expectedList = List.of();
        Assertions.assertEquals(expectedList, processor.sortByLength(initialList));
    }
}
