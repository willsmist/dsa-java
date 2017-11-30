package com.csygl.dsa.queue;

import org.junit.Test;

public class LinkedQueueTest {

    @Test
    public void test() throws Exception {
        LinkedQueue<String> q = new LinkedQueue<>();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());

        q.enqueue("a");
        q.enqueue("b");
        System.out.println(q.front());
        q.traversal();
        System.out.println(q.dequeue());
        q.traversal();
        System.out.println(q.dequeue());
        //q.traversal();
    }
}