package com.csygl.dsa.sequence;

import com.csygl.dsa.stack.ArrayStack;

import java.util.ArrayList;
import java.util.Random;

/**
 * 序列工具类
 */
public class SequenceUtil {

    /**
     * 生成随机整数序列
     *
     * @param limit  随机数字上限
     * @param length 序列中元素个数
     * @return 返回随机整数组成的数组
     */
    public static Integer[] randomSeq(int limit, int length) {
        Integer[] rs = new Integer[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            rs[i] = r.nextInt(limit);
        }
        return rs;
    }

    /**
     * 生成随机无重复整数序列
     *
     * @param limit  随机数字上限
     * @param length 序列中元素个数
     * @return 返回随机无重复整数组成的数组
     */
    public static Integer[] randomSeqWithNoDups(int limit, int length) {
        if (limit < length) {
            throw new RuntimeException("limit can't be less than value of length");
        }
        Integer[] rs = new Integer[length];
        Random r = new Random();
        ArrayList<Integer> l = new ArrayList<>();
        int v;
        for (int i = 0; i < length; i++) {
            do {
                v = r.nextInt(limit);
            } while (l.contains(v));
            l.add(v);
            rs[i] = v;
        }
        return rs;
    }

    /**
     * 反转序列
     *
     * @param s 指定序列
     */
    public static void reverse(Sequence s) {
        for (int i = 0; i < (s.getSize() / 2); i++) {
            s.swapByRank(i, s.getSize() - 1 - i);
        }
    }

    /**
     * 递归形式简洁调用
     *
     * @param s 指定序列
     */
    public static void reverseRecur(Sequence s) {
        reverseRecur(s, 0, s.getSize() - 1);
    }

    /**
     * 递归实现反转序列
     *
     * @param s  指定序列
     * @param lo 子序列首元素下标
     * @param hi 子序列末元素下标
     */
    public static void reverseRecur(Sequence s, int lo, int hi) {
        if (lo < hi) {
            s.swapByRank(lo, hi);
            reverseRecur(s, ++lo, --hi);
        }
    }


    /**
     * 迭代形式简洁调用
     *
     * @param s 制定序列
     */
    public static void reverseIter(Sequence s) {
        reverseIter(s, 0, s.getSize() - 1);
    }

    /**
     * 迭代实现反转序列
     *
     * @param s  指定序列
     * @param lo 子序列首元素下标
     * @param hi 子序列末元素下标
     */
    public static void reverseIter(Sequence s, int lo, int hi) {
        while (lo < hi) {
            s.swapByRank(lo, hi);
            lo++;
            hi--;
        }
    }

    /**
     * 借助 Stack 实现反转序列
     *
     * @param s 指定序列
     */
    public static <E> void reverseByStack(Sequence<E> s) {
        ArrayStack<E> stack = new ArrayStack<>(s.getSize());
        for (int i = 0; i < s.getSize(); i++) {
            stack.push(s.getAtRank(i));
        }
        for (int i = 0; i < s.getSize(); i++) {
            s.replaceAtRank(i, stack.pop());
        }
    }
}
