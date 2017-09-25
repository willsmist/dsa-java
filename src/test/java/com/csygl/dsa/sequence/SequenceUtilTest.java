package com.csygl.dsa.sequence;

import org.junit.Test;

import java.util.Arrays;

public class SequenceUtilTest {

    @Test
    public void randomSeq() {
        Integer[] s = SequenceUtil.randomSeq(10, 10);
        System.out.println(Arrays.toString(s));
    }

    @Test
    public void randomSeqWithNoDups() {
        Integer[] s = SequenceUtil.randomSeqWithNoDups(10, 10);
        System.out.println(Arrays.toString(s));
    }

    @Test
    public void reverse() {
        Sequence_Impl<Integer> s = new Sequence_Impl<>(SequenceUtil.randomSeqWithNoDups(50, 6));
        System.out.println(s);
        SequenceUtil.reverse(s);
        System.out.println(s);
    }

    @Test
    public void reverseRecur() {
        Sequence_Impl<Integer> s = new Sequence_Impl<>(SequenceUtil.randomSeqWithNoDups(50, 7));
        System.out.println(s);
        SequenceUtil.reverseRecur(s);
        System.out.println(s);
    }

    @Test
    public void reverseIter() {
        Sequence_Impl<Integer> s = new Sequence_Impl<>(SequenceUtil.randomSeqWithNoDups(50, 7));
        System.out.println(s);
        SequenceUtil.reverseIter(s);
        System.out.println(s);
    }
}