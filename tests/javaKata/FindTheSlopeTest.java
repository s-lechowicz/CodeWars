package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheSlopeTest {
    @Test
    public void slope() throws Exception {
        int[] test1 = {19, 3, 20, 3};
        int[] test2 = {-7, 2, -7, 4};
        int[] test3 = {10, 50, 30, 150};
        int[] test4 = {15, 45, 12, 60};
        int[] test5 = {10, 20, 20, 80};
        int[] test6 = {-10, 6, -10, 3};
        FindTheSlope s = new FindTheSlope();

        assertEquals("0", s.slope(test1));
        assertEquals("undefined", s.slope(test2));
        assertEquals("5", s.slope(test3));
        assertEquals("-5", s.slope(test4));
        assertEquals("6", s.slope(test5));
        assertEquals("undefined", s.slope(test6));
    }
}