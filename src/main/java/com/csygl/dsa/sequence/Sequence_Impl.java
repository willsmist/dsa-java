package com.csygl.dsa.sequence;

import java.util.Arrays;

/**
 * Sequence 接口实现类
 */
public class Sequence_Impl<E> implements Sequence<E> {

    private final E[] s;

    public Sequence_Impl(E[] objects) {
        s = Arrays.copyOf(objects, objects.length);
    }

    /**
     * 获取序列中元素的个数
     *
     * @return 返回序列中元素的个数
     */
    @Override
    public int getSize() {
        return s.length;
    }

    /**
     * 获取指定位置的元素
     *
     * @param index 下标
     * @return 返回指定下标的元素
     */
    @Override
    public E getAtRank(int index) {
        return s[index];
    }

    /**
     * 替换序列中指定位置的元素
     *
     * @param index 被替换元素在序列中的下标
     * @param obj   替换后的元素
     */
    @Override
    public void replaceAtRank(int index, E obj) {
        s[index] = obj;
    }

    /**
     * 交换序列中指定两个位置的元素
     *
     * @param p1 被交换元素下标
     * @param p2 被交换元素下标
     */
    @Override
    public void swapByRank(int p1, int p2) {
        E t = getAtRank(p1);
        replaceAtRank(p1, getAtRank(p2));
        replaceAtRank(p2, t);
    }

    @Override
    public String toString() {
        return Arrays.toString(s);
    }
}
