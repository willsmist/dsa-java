package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest extends TestBase {

    @Test
    public void binaryFib() {
        Fibonacci f = new Fibonacci();
        assertEquals(3, f.binaryFib(4));
        System.out.println(f.binaryFib(45));
    }

    @Test
    public void linearFib() {
        Fibonacci f = new Fibonacci();
        System.out.println(f.linearFib(45));
    }

    @Test
    public void iterFib() {
        Fibonacci f = new Fibonacci();
        System.out.println(f.iterFib(45));
    }

    @Test
    public void testBoundary() {
        Fibonacci f = new Fibonacci();
        // n = 0
        System.out.println(f.binaryFib(0));
        System.out.println(f.linearFib(0));
        System.out.println(f.iterFib(0));
        // n = 1
        System.out.println(f.binaryFib(1));
        System.out.println(f.linearFib(1));
        System.out.println(f.iterFib(1));
        // n = 2
        System.out.println(f.binaryFib(2));
        System.out.println(f.linearFib(2));
        System.out.println(f.iterFib(2));
        //n = 20
        System.out.println(f.binaryFib(20));
        System.out.println(f.linearFib(20));
        System.out.println(f.iterFib(20));
    }
}