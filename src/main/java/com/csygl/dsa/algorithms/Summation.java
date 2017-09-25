package com.csygl.dsa.algorithms;

/**
 * 求和
 */
public class Summation {

    /**
     * 一般求和
     *
     * @param a 整数数组
     * @return 数组所有元素的和
     */
    public int sum(int[] a) {
        int s = 0;
        for (int anA : a) {
            s += anA;
        }
        return s;
    }

    /**
     * 线性递归简洁调用
     *
     * @param a 整数数组
     * @return 数组所有元素的和
     */
    public int linearSum(int[] a) {
        return linearSum(a, a.length);
    }

    /**
     * 线性递归实现求和
     *
     * @param a 整数数组
     * @param n 参与求和的元素个数
     * @return 数组所有元素的和
     */
    public int linearSum(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }
        return linearSum(a, n - 1) + a[n - 1];
    }

    /**
     * 二分递归简洁调用
     *
     * @param a 整数数组
     * @return 数组所有元素的和
     */
    public int binarySum(int[] a) {
        return binarySum(a, 0, a.length);
    }

    /**
     * 二分递归实现求和
     *
     * @param a 整数数组
     * @param i 参与求和元素起始位置
     * @param n 参与求和元素个数
     * @return 数组所有元素的和
     */
    public int binarySum(int[] a, int i, int n) {
        if (n == 1) {
            return a[i];
        }
        if (n % 2 == 0) {
            return binarySum(a, i, n / 2) + binarySum(a, i + n / 2, n / 2);
        }
        return binarySum(a, i, n / 2) + binarySum(a, i + n / 2, n / 2 + 1);
    }


}
