package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

@DisplayName("Splitting a string into parts using a delimiter")
public class SplitStringTest extends MainProcessorTest {

    @Test
    public void userCanSplitValidString() {
        String initialString = "Java,Python,C++";
        String delimiter = ",";
        String[] expectedString = new String[]{"Java", "Python", "C++"};
        Assertions.assertArrayEquals(expectedString, processor.splitString(initialString, delimiter));
    }

    @Test
    public void userCannotSplitEmptyString() {
        String initialString = "";
        String delimiter = ",";
        String[] expectedString = new String[]{""};
        Assertions.assertArrayEquals(expectedString, processor.splitString(initialString, delimiter));
    }

    @Test
    public void userCanSplitWithValidOneString() {
        String initialString = "Java";
        String delimiter = ",";
        String[] expectedString = new String[]{"Java"};
        Assertions.assertArrayEquals(expectedString, processor.splitString(initialString, delimiter));
    }
}
