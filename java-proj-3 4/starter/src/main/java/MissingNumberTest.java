import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberTest {
    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private MissingNumber test = new MissingNumber();

    @Test
    public void testMissingNumber_MissingMax() {
        assertEquals(10, test.missingNumber(missingMax, 10));
    }

    @Test
    public void testMissingNumber_NoneMissing() {
        assertEquals(0, test.missingNumber(missingNone, 10));
    }

    @Test
    public void testMissingNumber_MissingSeven() {
        assertEquals(7, test.missingNumber(missingSeven, 10));
    }


}
