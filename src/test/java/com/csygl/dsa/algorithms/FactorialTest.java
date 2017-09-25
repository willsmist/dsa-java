package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void iterFact() {
        Factorial f = new Factorial();
        assertEquals(120L, f.iterFact(5));
        System.out.println(f.iterFact(10));

    }

    @Test
    public void recurFact() {
        Factorial f = new Factorial();
        assertEquals(120L, f.recurFact(5));
        System.out.println(f.recurFact(10));
    }

}