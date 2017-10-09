package com.csygl.dsa.queue;

/**
 * 双端队列 ADT 接口
 */
public interface Deque<E> {

    /**
     * 获取队列中元素的个数
     *
     * @return 队列中元素的个数
     */
    int getSize();

    /**
     * 判断队列是否为空
     *
     * @return true 表示队列非空, false 表示队列空
     */
    boolean isEmpty();

    /**
     * 将新元素作为首元素插入
     *
     * @param e 新元素
     */
    void insertFirst(E e);

    /**
     * 将新元素作为末元素插入
     *
     * @param e 新元素
     */
    void insertLast(E e);

    /**
     * 删除首元素并返回
     *
     * @return 首元素
     * @throws QueueEmptyException 队列空异常
     */
    E removeFirst() throws QueueEmptyException;

    /**
     * 删除末元素并返回
     *
     * @return 末元素
     * @throws QueueEmptyException 队列空异常
     */
    E removeLast() throws QueueEmptyException;

    /**
     * 取首元素
     *
     * @return 首元素
     */
    E first();

    /**
     * 取末元素
     *
     * @return 末元素
     */
    E last();

    /**
     * 遍历
     */
    void traversal();
}
