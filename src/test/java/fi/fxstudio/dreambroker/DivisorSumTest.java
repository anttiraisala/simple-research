package fi.fxstudio.dreambroker;

import static org.junit.Assert.*;
import org.junit.Test;


public class DivisorSumTest {
    @Test
    public void nullTest() {
        int value = DivisorSum.getSum(0, null);

        assertEquals(0, value);
    }

    @Test
    public void threeTest() {
        int value = DivisorSum.getSum(11, 3);

        assertEquals(9, value);
    }

    @Test
    public void fiveTest() {
        int value = DivisorSum.getSum(11, 5);

        assertEquals(10, value);
    }

    @Test
    public void threeAndFiveTest() {
        int value = DivisorSum.getSum(11, 3, 5);

        assertEquals(19, value);
    }

    @Test
    public void exampleTest() {
        int value = DivisorSum.getSum(20, 5, 7);

        assertTrue(true);
    }

    @Test
    public void interviewTest() {
        int value = DivisorSum.getSum(1000, 5, 7);

        assertTrue(true);
    }
}
