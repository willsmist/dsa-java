package com.csygl.dsa.algorithms;

/**
 * 阶乘
 */
public class Factorial {

    /**
     * 递归计算阶乘
     * @param n 阶乘参数
     * @return 阶乘的结果
     */
    public long fact(int n) {
        if (n <= 1) {
            return 1L;
        }
        return n * fact(n - 1);
    }
}
