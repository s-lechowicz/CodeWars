package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OppositeNumberTest {
    @Test
    public void opposite() throws Exception {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}