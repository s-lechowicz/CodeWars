package javaKata;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class YoureASquareTest {

    @Test
    public void positiveCaseSquareTest() throws Exception {
        assertTrue("4 is a square number (2 * 2)", YoureASquare.isSquare(4));
        assertTrue("25 is a square number (5 * 5)", YoureASquare.isSquare(25));
    }

    @Test
    public void negativeCaseSquareTest() throws Exception {
        assertFalse("3 isn't a square number", YoureASquare.isSquare(3));
        assertFalse("26 isn't a square number", YoureASquare.isSquare(26));
    }

    @Test
    public void negativeNumberTest() {
        assertFalse("negative numbers aren't square numbers", YoureASquare.isSquare(-1));
    }

    @Test
    public void zeroTest() {
        assertTrue("0 is a square number (0 * 0)", YoureASquare.isSquare(0));
    }

}
