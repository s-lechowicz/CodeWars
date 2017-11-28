package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void multiply() throws Exception {
        assertEquals("5.0", Multiply.multiply(2.5, 2.0).toString());
    }

}