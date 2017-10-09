package com.csygl.dsa.common;

/**
 * 位置 ADT 接口
 */
public interface Position<E> {

    /**
     * 返回当前位置保存的元素
     *
     * @return 该位置保存的元素
     */
    E getElement();

    /**
     * 将指定的元素存放在当前位置，并将原来的元素返回
     *
     * @param e 新元素
     * @return 原来的元素
     */
    E setElement(E e);
}
