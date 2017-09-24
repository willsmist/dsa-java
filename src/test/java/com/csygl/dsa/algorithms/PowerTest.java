package com.csygl.dsa.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest extends TestBase {

    @Test
    public void powerBrute() {
        Power p = new Power();
        assertEquals(125,p.powerBrute(5,3));
        System.out.println(p.powerBrute(3,20));
    }

    @Test
    public void powerRecur() {
        Power p = new Power();
        System.out.println(p.powerRecur(3, 20));
    }

    @Test
    public void powerRecurFast(){
        Power p = new Power();
        System.out.println(p.powerRecurFast(3, 20));
    }
}