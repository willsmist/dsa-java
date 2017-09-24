package com.csygl.dsa.algorithms;

import org.junit.After;
import org.junit.Before;

public class TestBase {

    private long startTime;
    private long endTime;

    @Before
    public void before() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void after() {
        endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime) + " ms" );
    }
}
