package com.csygl.dsa.algorithms;

import org.junit.Before;
import org.junit.Test;

public class SummationTest {

    private Summation s;
    private final int[] a = new int[]{1, 2, 3, 4, 5};

    @Before
    public void before() {
        s = new Summation();
    }

    @Test
    public void sum() {
        System.out.println(s.sum(a));
    }

    @Test
    public void linearSum() {
        System.out.println(s.linearSum(a));
    }

    @Test
    public void binarySum() {
        System.out.println(s.binarySum(a));
    }

}