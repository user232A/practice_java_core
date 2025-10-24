package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

@DisplayName("Checking if a string is an anagram of another")
public class AnagramTest extends MainProcessorTest {

    @Test
    public void userCanCheckStringAnagram() {
        String initialString = "listen";
        String expectedString = "silent";
        Assertions.assertTrue(processor.isAnagram(initialString, expectedString));
    }

    @Test
    public void userCanCheckInvalidStringAnagram() {
        String initialString = "java";
        String expectedString = "silent";
        Assertions.assertFalse(processor.isAnagram(initialString, expectedString));
    }
}
