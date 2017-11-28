package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheGCFofTwoNumbersTest {
    @Test
    public void basicTests() {
        assertEquals(FindTheGCFofTwoNumbers.findGCF(8, 20), 4);
        assertEquals(FindTheGCFofTwoNumbers.findGCF(5, 13), 1);
        assertEquals(FindTheGCFofTwoNumbers.findGCF(100, 100), 100);
    }
}