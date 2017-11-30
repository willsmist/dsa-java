package com.csygl.dsa.list;

import com.csygl.dsa.common.Position;
import com.csygl.dsa.common.Iterator;

/**
 * 列表接口
 */
public interface List<E> {

    //列表中元素的数目
    int getSize();

    //判断列表是否为空
    boolean isEmpty();

    //返回列表第一个元素的位置
    Position<E> first();

    //返回列表最后一个元素的位置
    Position<E> last();

    //返回给定位置之后元素的位置
    Position<E> getNext(Position<E> p);

    //返回给定位置之前元素的位置
    Position<E> getPrev(Position<E> p);

    //将 e 作为第一个元素插入列表
    Position<E> insertFirst(E e);

    //将 e 作为最后一个元素插入列表
    Position<E> insertLast(E e);

    //将 e 插入位置 p 之后的位置
    Position<E> insertAfter(Position<E> p, E e);

    //将 e 插入位置 p 之前的位置
    Position<E> insertBefore(Position<E> p, E e);

    //删除给定位置 p 的元素,并返回该元素
    E remove(Position<E> p);

    //删除首元素,并返回之
    E removeFirst();

    //删除末元素,并返回之
    E removeLast();

    //替换给定位置 p 出的元素为 e,并返回旧元素
    E replace(Position<E> p, E e);

    //位置迭代器
    Iterator<E> positions();

    //元素迭代器
    Iterator<E> elements();
}
