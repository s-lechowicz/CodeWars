package javaKata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatePhoneNumberTest {
    @Test
    public void createPhoneNumber() throws Exception {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}