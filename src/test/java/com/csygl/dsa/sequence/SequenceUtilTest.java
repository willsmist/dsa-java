package com.csygl.dsa.sequence;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SequenceUtilTest {
    @Test
    public void randomSeq() throws Exception {
        int[] s = SequenceUtil.randomSeq(10,10);
        System.out.println(Arrays.toString(s));
    }

    @Test
    public void randomSeqWithNoDups() throws Exception {
        int[] s = SequenceUtil.randomSeqWithNoDups(10,10);
        System.out.println(Arrays.toString(s));
    }

}