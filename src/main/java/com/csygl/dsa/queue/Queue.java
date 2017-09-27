package com.csygl.dsa.queue;

/**
 * 队列接口
 */
public interface Queue<E> {


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
     * 入队
     * <p>
     * 将指定对象加入队列末端
     *
     * @param e 入队对象
     */
    void enqueue(E e);

    /**
     * 出队
     * <p>
     * 若队列非空，则将队首元素移除,并将其返回
     * 否则，抛出异常
     *
     * @return 队首元素
     * @throws QueueEmptyException 队列空异常
     */
    E dequeue() throws QueueEmptyException;

    /**
     * 出队
     * <p>
     * 若队列非空，则将队首元素返回
     * 否则，抛出异常
     *
     * @return 队首元素
     * @throws QueueEmptyException 队列空异常
     */
    E front() throws QueueEmptyException;

    /**
     * 遍历队列
     */
    void traversal();
}
