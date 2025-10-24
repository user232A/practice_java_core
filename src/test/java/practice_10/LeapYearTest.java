package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Check leap year")
public class LeapYearTest extends MainProcessorTest {

    @ParameterizedTest
    @CsvSource({"1925", "1955", "1982", "1969"})
    public void userCanCheckLeapWithOrdinaryYear(int year) {
        Assertions.assertFalse(processor.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({"1908", "1988", "2020", "1968"})
    public void userCanCheckLeapYear(int year) {
        Assertions.assertTrue(processor.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({"1900", "2100"})
    public void userCanCheckLeapYearWhichDivideOneHundredButNoFourHundred(int year) {
        Assertions.assertFalse(processor.isLeapYear(year));
    }
}
