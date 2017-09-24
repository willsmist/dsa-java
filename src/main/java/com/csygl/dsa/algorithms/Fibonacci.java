package com.csygl.dsa.algorithms;

/**
 * 斐波那契数
 */
public class Fibonacci {

    /**
     * 二分递归计算斐波那契数
     * @param n 整数
     * @return 返回斐波那契数列中第 n 个数
     */
    public int binaryFib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return binaryFib(n - 1) + binaryFib(n - 2);
    }
}
