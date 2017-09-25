package com.csygl.dsa.algorithms;

/**
 * 幂运算
 * <p>
 * 理论上，该类依次定义的三个方法使用的算法时间复杂度是一次降低的，
 * 但在本开发机器上的表现正好相反
 */
public class Power {

    /**
     * 根据定义计算幂
     *
     * @param a 底数
     * @param r 指数
     * @return 幂运算结果
     */
    public long powerBrute(int a, int r) {
        long p = 1;
        while (r-- > 0) {
            p = p * a;
        }
        return p;
    }

    /**
     * 简单递归幂运算
     *
     * @param a 底数
     * @param r 指数
     * @return 幂运算结果
     */
    public long powerRecur(int a, int r) {
        if (r == 0) {
            return 1;
        }
        return a * powerRecur(a, r - 1);
    }

    /**
     * 更有效率的递归幂运算
     *
     * @param a 底数
     * @param r 指数
     * @return 幂运算结果
     */
    public long powerRecurFast(int a, int r) {
        if (r == 0) {
            return 1;
        }
        long half = powerRecurFast(a, r / 2);
        if (r % 2 == 0) {
            return half * half;
        } else {
            return a * half * half;
        }
    }
}
