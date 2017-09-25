package com.csygl.dsa.algorithms;

/**
 * 斐波那契数
 */
public class Fibonacci {

    private int f;//当前 Fibonacci 数
    private int p;//当前 Fibonacci 数的上一个数

    /**
     * 二分递归计算斐波那契数
     *
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

    /**
     * 线性递归计算斐波那契数
     *
     * @param n 整数
     * @return 返回斐波那契数列中第 n 个数
     */
    public int linearFib(int n) {
        linearFib_recur(n);
        return f;
    }

    private void linearFib_recur(int n) {
        if (n <= 1) {
            f = n;
            p = 0;
            return;
        }
        linearFib_recur(n - 1);
        int t = f;
        f = f + p;
        p = t;
    }

    /**
     * 迭代计算斐波那契数
     *
     * @param n 整数
     * @return 返回斐波那契数列中第 n 个数
     */
    public int iterFib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int t = a;
            a = b;
            b += t;
        }
        return b;
    }
}
