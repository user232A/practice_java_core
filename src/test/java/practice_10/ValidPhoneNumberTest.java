package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Check valid phone number")
public class ValidPhoneNumberTest extends MainProcessorTest{

    @ParameterizedTest
    @CsvSource({"+1 1234567890", "+7 5897452159", "+4 9854621178", "+7 5579433487"})
    public void userCanCheckValidPhoneNumber(String phone){
        Assertions.assertTrue(processor.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @CsvSource({"number", "+7", "-5687", "+7 email"})
    public void userCanCheckNotValidPhoneNumber(String phone){
        Assertions.assertFalse(processor.isValidPhoneNumber(phone));
    }
}
