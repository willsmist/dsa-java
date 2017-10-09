package com.csygl.dsa.vector;

import org.junit.Test;

public class ExtArrayVectorTest {
    @Test
    public void insertAtRank() {
        Vector<Integer> v = new ExtArrayVector<>();
        System.out.println(v);
        for (int i = 0; i < 17; i++) {
            v.insertAtRank(i, i);
        }
        System.out.println(v);
        System.out.println(v.getSize());
    }

}