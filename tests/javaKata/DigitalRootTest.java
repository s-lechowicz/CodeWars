package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalRootTest {
    @Test
    public void digital_root() throws Exception {
        assertEquals("Nope!", DigitalRoot.digital_root(16), 7);
    }
}