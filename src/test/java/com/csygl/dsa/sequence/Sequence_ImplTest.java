package com.csygl.dsa.sequence;

import org.junit.Test;

import java.util.Arrays;

public class Sequence_ImplTest {


    @SuppressWarnings("unchecked")
    @Test
    public void test() {
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5};
        Sequence_Impl s = new Sequence_Impl(ints);
        System.out.println(s);
        System.out.println(s.getSize());
        System.out.println(s.getAtRank(1));
        s.replaceAtRank(0,10);
        System.out.println(s);
        System.out.println(Arrays.toString(ints));
        s.swapByRank(3,4);
        System.out.println(s);
    }

}