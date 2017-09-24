package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void fact() {
        Factorial f = new Factorial();
        assertEquals(120L, f.fact(5));
        System.out.println(f.fact(50));
    }

}