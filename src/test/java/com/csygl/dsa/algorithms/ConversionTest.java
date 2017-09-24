package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversionTest {

    @Test
    public void testConvert() {
        Conversion c = new Conversion();
        assertEquals("1111011", c.convert(123, 2));
        assertEquals("173", c.convert(123, 8));
        assertEquals("7B", c.convert(123, 16));
        System.out.println(c.convert(123,3));
    }

    @Test
    public void testConvert1() {
        Conversion c = new Conversion();
        assertEquals("173", c.convert(2, "1111011", 8));
        assertEquals("7B", c.convert(8, "173", 16));
//        System.out.println(c.convert(3, "11120", 10));
        long start = System.currentTimeMillis();
        System.out.println(c.convert(10,String.valueOf(Integer.MAX_VALUE),3));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void testConvertToDec() {
        Conversion c = new Conversion();
        assertEquals(123, c.convertToDec(2, "1111011"));
        assertEquals(123, c.convertToDec(8,"173"));
        assertEquals(123, c.convertToDec(16,"7B"));
    }
}
