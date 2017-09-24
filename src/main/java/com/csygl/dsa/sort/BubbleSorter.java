package com.csygl.dsa.sort;

import com.csygl.dsa.sequence.Sequence;

import java.util.Comparator;

/**
 * 冒泡排序
 */
public class BubbleSorter implements Sorter {

    private Comparator c;//比较器

    public BubbleSorter(Comparator comp) {
        c = comp;
    }

    /**
     * 排序实现
     *
     * @param s 序列
     */
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Sequence s) {
        for (int i = 0; i < s.getSize() - 1; i++) {
            for (int j = 0; j < s.getSize() - i - 1; j++) {
                if (c.compare(s.getAtRank(j), s.getAtRank(j + 1)) > 0) {
                    s.swapByRank(j, j + 1);
                }
            }
        }

    }

    public void setComparator(Comparator comp){
        c = comp;
    }
}
