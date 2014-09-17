package ru.patashnik.projecteuler.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void testPrime() {
        int[] expected = {1, 2, 3, 5, 7, 11, 13};
        assertArrayEquals(expected, PrimeNumber.all(15));
        assertEquals(169, PrimeNumber.all(1000).length);
    }
}
