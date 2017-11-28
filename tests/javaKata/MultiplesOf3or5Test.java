package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesOf3or5Test {
    MultiplesOf3or5 testClass = new MultiplesOf3or5();

    @Test
    public void solution() throws Exception {
        assertEquals(23, testClass.solution(10));
    }
}