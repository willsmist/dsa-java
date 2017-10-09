package com.csygl.dsa.vector;

import org.junit.Test;

public class ArrayVectorTest {

    @Test
    public void test() {
        Vector<String> v = new ArrayVector<>();
        v.insertAtRank(0, "a");
        v.insertAtRank(1, "b");
        v.insertAtRank(2, "c");
        v.insertAtRank(3, "d");
        v.insertAtRank(4, "e");
        System.out.println(v);
        System.out.println(v.getSize());

        System.out.println(v.removeAtRank(4));
        System.out.println(v);
        System.out.println(v.getSize());

        System.out.println(v.getAtRank(1));
        System.out.println(v.replaceAtRank(1, "replace"));
        System.out.println(v);
    }

}