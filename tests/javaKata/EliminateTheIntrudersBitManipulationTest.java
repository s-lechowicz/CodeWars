package javaKata;

import org.junit.Test;

import static org.junit.Assert.*;

public class EliminateTheIntrudersBitManipulationTest {
    EliminateTheIntrudersBitManipulation sb = new EliminateTheIntrudersBitManipulation();

    @Test
    public void sampleTests() {
        assertEquals(sb.eliminateSetBits("11010101010101"), 255);
        assertEquals(sb.eliminateSetBits("111"), 7);
        assertEquals(sb.eliminateSetBits("1000000"), 1);
    }
}