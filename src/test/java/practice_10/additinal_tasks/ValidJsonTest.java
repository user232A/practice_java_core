package practice_10.additinal_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_10.MainProcessorTest;

@DisplayName("Checking if a string is a JSON object")
public class ValidJsonTest extends MainProcessorTest {

    @Test
    public void userCanCheckValidJson() {
        String json = "{\"key\":\"value\"}";
        Assertions.assertTrue(processor.isValidJson(json));
    }

    @Test
    public void userCanCheckInvalidJson() {
        String json = "invalid json";
        Assertions.assertFalse(processor.isValidJson(json));
    }

    @Test
    public void userCannotCheckInvalidJsonWithNull() {
        String json = null;
        Assertions.assertFalse(processor.isValidJson(json));
    }
}
