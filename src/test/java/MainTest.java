import org.junit.Test;

import static dateExercitiu.Exercitiu.countNumberOfDigits;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void checkDigitForRealNumber() {
        assertEquals(3, countNumberOfDigits(100.0));
    }

    @Test
    public void checkDigitForNegativeNumber() {
        assertEquals(1, countNumberOfDigits(-5));
    }

    @Test
    public void checkIfItIgnoresSigns() {
        assertEquals(1, countNumberOfDigits(-3.142));
    }

    @Test
    public void checkDigitForLongNumber() {
        assertEquals(5, countNumberOfDigits(9999.9999f));
    }

    @Test
    public void checkDigitForZeroValue() {
        assertEquals(1, countNumberOfDigits(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberOfDigitsInIntegerPartWithNullInput() {
        countNumberOfDigits(null);
    }

    @Test
    public void testNumberOfDigitsAdditional() {
        assertEquals(10, countNumberOfDigits(1234567890));
    }
}
