package com.csygl.dsa.algorithms;

import com.csygl.dsa.stack.ArrayStack;

/**
 * 数组相关操作
 */
public class ArrayUtil {

    /**
     * 借助栈实现数组元素反转
     *
     * @param eles 数组
     * @param <E>  类型参数
     */
    public static  <E> void reverse(E[] eles) {
        ArrayStack<E> stack = new ArrayStack<>(eles.length);
        for (E e : eles) {
            stack.push(e);
        }
        for (int i = 0; i < eles.length; i++) {
            eles[i] = stack.pop();
        }
    }
}
