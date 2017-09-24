package com.csygl.dsa.algorithms;

/**
 * 计算乘方
 */
public class Power {

    public long powerBrute(int a, int r){
        long p = 1L;
        while(r-- > 0){
            p *= a;
        }
        return p;
    }
}
