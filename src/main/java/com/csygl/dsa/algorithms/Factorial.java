package com.csygl.dsa.algorithms;

/**
 * 阶乘
 */
public class Factorial {

    /**
     * 递归计算阶乘
     *
     * @param n 正整数
     * @return 阶乘的结果
     */
    public long recurFact(int n) {
        if (n <= 1) {
            return 1L;
        }
        return n * recurFact(n - 1);
    }

    /**
     * 迭代计算阶乘
     *
     * @param n 正整数
     * @return 阶乘的结果
     */
    public long iterFact(int n) {
        if (n <= 1) {
            return 1L;
        }
        long r = 1L;
        for (int i = n; i > 0; i--) {
            r *= i;
        }
        return r;
    }
}
