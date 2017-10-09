package com.csygl.dsa.vector;

/**
 * 向量 ADT 接口
 */
public interface Vector<E> {

    /**
     * 返回向量中元素的数目
     *
     * @return 向量中元素数目
     */
    int getSize();

    /**
     * 判断向量是否为空
     *
     * @return true 表示向量为空, false 表示向量非空
     */
    boolean isEmpty();

    /**
     * 取秩为 r 的元素
     *
     * @param r 秩
     * @return 秩为 r 的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    E getAtRank(int r) throws VectorRankOutOfBoundsException;

    /**
     * 将秩为 r 的元素替换为对象 e
     *
     * @param r 秩
     * @param e 对象
     * @return 被替换的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    E replaceAtRank(int r, E e) throws VectorRankOutOfBoundsException;

    /**
     * 插入对象 e 作为秩为 r 的元素，并返回该元素
     *
     * @param r 秩
     * @param e 对象
     * @return 新插入的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    E insertAtRank(int r, E e) throws VectorRankOutOfBoundsException;

    /**
     * 删除秩为 r 的元素
     *
     * @param r 秩
     * @return 被删除的原秩为 r 的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    E removeAtRank(int r) throws VectorRankOutOfBoundsException;
}
