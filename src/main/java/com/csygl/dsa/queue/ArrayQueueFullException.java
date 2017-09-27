package com.csygl.dsa.queue;

/**
 * 基于数组实现队列满异常
 */
public class ArrayQueueFullException extends RuntimeException {

    public ArrayQueueFullException() {
        this("com.csygl.dsa.queue.ArrayQueueFullException: queue full");
    }

    public ArrayQueueFullException(String msg) {
        super(msg);
    }
}
