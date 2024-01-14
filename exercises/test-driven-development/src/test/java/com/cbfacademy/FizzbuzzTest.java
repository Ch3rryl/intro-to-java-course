package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("fizzbuzz logic test")
public class FizzbuzzTest {

    //failing test
    @Test
    @DisplayName("Test Fizz fail at 1")
        public void testFizzFail() {
            final String actualResult = ("1");
            assertEquals( actualResult, "Fizz");
    }
// passing test
    @Test
    @DisplayName("Test Fizz result at 1")
    public void testFizz() {
        final String actualResult = ("1");
        assertEquals(actualResult, "1");
    }


}
