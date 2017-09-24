package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtremeTest {

    @Test
    public void testMax() {
        assertEquals(9, new Extreme(new int[]{1, 3, 5, 7, 9}).max());
    }

    @Test
    public void testMin() {
        assertEquals(1, new Extreme(new int[]{1, 3, 5, 7, 9}).min());
    }
}
