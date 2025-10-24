package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

import java.util.List;

@DisplayName("Convert a list of strings to a list of their lengths")
public class MapToLengthTest extends MainProcessorTest {

    @Test
    public void userCanMapValidListToLength() {
        List<String> initialList = List.of("Java", "C++", "Go");
        List<Integer> expectedList = List.of(4, 3, 2);
        Assertions.assertEquals(expectedList, processor.mapToLengths(initialList));
    }

    @Test
    public void userCannotMapEmptyListToLength() {
        List<String> initialList = List.of();
        List<Integer> expectedList = List.of();
        Assertions.assertEquals(expectedList, processor.mapToLengths(initialList));
    }
}
