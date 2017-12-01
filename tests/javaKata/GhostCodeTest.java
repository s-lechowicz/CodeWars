package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhostCodeTest {
    @Test
    public void exampleTests() {
        assertEquals(GhostCode.helloName("Javatlacati"), "Hello my name is Javatlacati", GhostCode.helloName("Javatlacati"));
    }
}