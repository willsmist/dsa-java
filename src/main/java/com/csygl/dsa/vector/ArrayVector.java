package com.csygl.dsa.vector;

import java.util.Arrays;

public class ArrayVector<E> implements Vector<E> {

    //数组容量
    protected static final int N = 1024;

    //向量实际容量
    protected int n;

    //对象数组
    protected Object[] v;

    public ArrayVector() {
        this(N);
    }

    public ArrayVector(int cap) {
        v = new Object[cap];
        n = 0;
    }

    /**
     * 返回向量中元素的数目
     *
     * @return 向量中元素数目
     */
    @Override
    public int getSize() {
        return n;
    }

    /**
     * 判断向量是否为空
     *
     * @return true 表示向量为空, false 表示向量非空
     */
    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    //位置访问操作

    @SuppressWarnings("unchecked")
    E elementData(int index) {
        return (E) v[index];
    }

    /**
     * 取秩为 r 的元素
     *
     * @param r 秩
     * @return 秩为 r 的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    @Override
    public E getAtRank(int r) throws VectorRankOutOfBoundsException {
        if (r < 0 || r >= n) {
            throw new VectorRankOutOfBoundsException(r + "");
        }
        return elementData(r);
    }

    /**
     * 将秩为 r 的元素替换为对象 e
     *
     * @param r 秩
     * @param e 对象
     * @return 被替换的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    @Override
    public E replaceAtRank(int r, E e) throws VectorRankOutOfBoundsException {
        if (r < 0 || r >= n) {
            throw new VectorRankOutOfBoundsException(r + "");
        }
        E oldElement = elementData(r);
        v[r] = e;
        return oldElement;
    }

    /**
     * 插入对象 e 作为秩为 r 的元素，并返回该元素
     *
     * @param r 秩
     * @param e 对象
     * @return 新插入的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    @Override
    public E insertAtRank(int r, E e) throws VectorRankOutOfBoundsException {
        if (r < 0 || r > n) {
            throw new VectorRankOutOfBoundsException(r + "");
        }
        if (n >= N) {
            throw new VectorRankOutOfBoundsException("array index out of bounds");
        }
        for (int i = n; i > r; i--) {
            v[i] = v[i - 1];
        }
        v[r] = e;
        n++;
        return e;
    }

    /**
     * 删除秩为 r 的元素
     *
     * @param r 秩
     * @return 被删除的原秩为 r 的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    @Override
    public E removeAtRank(int r) throws VectorRankOutOfBoundsException {
        if (r < 0 || r >= n) {
            throw new VectorRankOutOfBoundsException(r + "");
        }
        E element = elementData(r);
        for (int i = r; i < n; i++) {//此处并不是 i < n-1
            v[i] = v[i + 1];//当 i 为 n-1 时,v[n-1]=v[n]表示将 v[n-1] 置为 null, 也就是 v[n] 的值
        }
        n--;
        return element;
    }

    // 仅用于测试
    @Override
    public String toString() {
        return Arrays.toString(v);
    }
}
