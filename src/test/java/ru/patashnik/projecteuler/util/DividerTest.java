package ru.patashnik.projecteuler.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class DividerTest {

    @Test
    public void testCount() {
        assertEquals(4, Divider.count(8));
        assertEquals(12, Divider.count(84));
    }
}
