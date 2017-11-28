package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNumbersFrom0toNTest {
    @Test
    public void showSequence() throws Exception {
        assertEquals("0+1+2+3+4+5+6 = 21", SumOfNumbersFrom0toN.showSequence(6));
    }
}
