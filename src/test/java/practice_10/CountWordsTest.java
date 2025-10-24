package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Counting the number of words in a line")
public class CountWordsTest extends MainProcessorTest {

    @Test
    public void userCanCountWords() {
        String sentence = "Paris Madrid London Riga Berlin";
        int expectedCount = 5;
        Assertions.assertEquals(expectedCount, processor.countWords(sentence));
    }

    @Test
    public void userCannotCountWordsWithEmptyString() {
        String sentence = "";
        int expectedCount = 0;
        Assertions.assertEquals(expectedCount, processor.countWords(sentence));
    }

    @Test
    public void userCannotCountWordsWithStringNull() {
        String sentence = null;
        Assertions.assertThrows(NullPointerException.class, () -> processor.countWords(sentence));
    }
}
