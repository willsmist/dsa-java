package com.csygl.dsa.algorithms;

import org.junit.After;
import org.junit.Before;

public class TestBase {

    private long startTime;

    @Before
    public void before() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void after() {
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime) + " ms\n" );
    }
}
