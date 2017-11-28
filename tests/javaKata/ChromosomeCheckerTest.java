package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChromosomeCheckerTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", ChromosomeChecker.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", ChromosomeChecker.chromosomeCheck("XX"));
    }
}