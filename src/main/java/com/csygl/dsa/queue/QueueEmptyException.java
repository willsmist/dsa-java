package com.csygl.dsa.queue;

/**
 * 队列空异常
 */
public class QueueEmptyException extends RuntimeException {

    public QueueEmptyException() {
        this("com.scygl.dsa.queue.QueueEmptyException: queue empyt");
    }

    public QueueEmptyException(String msg) {
        super(msg);
    }
}
