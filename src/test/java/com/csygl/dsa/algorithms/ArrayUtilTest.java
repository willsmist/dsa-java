package com.csygl.dsa.algorithms;

import com.csygl.dsa.sequence.SequenceUtil;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilTest {
    @Test
    public void reverse() throws Exception {
        Integer[] s = SequenceUtil.randomSeqWithNoDups(50,8);
        System.out.println(Arrays.toString(s));
        ArrayUtil.reverse(s);
        System.out.println(Arrays.toString(s));
    }

}