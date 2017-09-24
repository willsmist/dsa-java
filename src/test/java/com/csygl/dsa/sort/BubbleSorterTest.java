package com.csygl.dsa.sort;

import com.csygl.dsa.sequence.SequenceUtil;
import com.csygl.dsa.sequence.Sequence_Impl;
import org.junit.Test;

import java.util.Comparator;

public class BubbleSorterTest {
    @Test
    public void sort() {
        Sequence_Impl<Integer> s = new Sequence_Impl<>(SequenceUtil.randomSeqWithNoDups(50,15));
        System.out.println(s);
        BubbleSorter sorter = new BubbleSorter(Comparator.comparing(o -> ((Integer) o)));
        sorter.sort(s);
        System.out.println(s);
    }

}