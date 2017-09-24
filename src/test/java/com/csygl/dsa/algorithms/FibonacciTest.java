package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest extends TestBase{
    @Test
    public void binaryFib() {
        Fibonacci f = new Fibonacci();
        assertEquals(3, f.binaryFib(4));
        System.out.println(f.binaryFib(45));

    }

}