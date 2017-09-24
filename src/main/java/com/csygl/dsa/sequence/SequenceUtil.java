package com.csygl.dsa.sequence;

import java.util.ArrayList;
import java.util.Random;

/**
 * 序列工具类
 */
public class SequenceUtil {

    /**
     * 生成随机整数序列
     * @param limit 随机数字上限
     * @param length 序列中元素个数
     * @return 返回随机整数组成的数组
     */
    public static int[] randomSeq(int limit, int length){
        int[] rs = new int[length];
        Random r = new Random();
        for(int i = 0; i < length - 1; i++){
            rs[i] = r.nextInt(limit);
        }
        return rs;
    }

    public static int[] randomSeqWithNoDups(int limit, int length){
        if(limit < length){
            throw new RuntimeException("limit can't be less than value of length");
        }
        int[] rs = new int[length];
        Random r = new Random();
        ArrayList<Integer> l = new ArrayList<>();
        int v;
        for (int i = 0; i < length; i++) {
            do {
                v = r.nextInt(limit);
            }while(l.contains(v));
            l.add(v);
            rs[i] = v;
        }
        return rs;
    }
}
