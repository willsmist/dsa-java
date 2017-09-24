package com.csygl.dsa.algorithms;

/**
 * 计算最值
 */
public class Extreme {

    private final int[] s;
    private int maxValue;
    private int minValue;

    public Extreme(int[] a) {
        s = a;
    }

    /**
     * 计算最大值
     *
     * @return 数组元素中最大值
     */
    public int max() {
        int maxValue = s[0];
        for (int i = 1; i < s.length; i++) {
            if (maxValue < s[i]) {
                maxValue = s[i];
            }
        }
        return maxValue;
    }

    /**
     * 计算最小值
     *
     * @return 数组元素中最小值
     */
    public int min() {
        int minValue = s[0];
        for (int i = 1; i < s.length; i++) {
            if (minValue > s[i]) {
                minValue = s[i];
            }
        }
        return minValue;
    }
}
