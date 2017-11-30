package com.csygl.dsa.queue;

import org.junit.Test;

public class DoubleLinkedDequeTest {

    @Test
    public void testState() {
        Deque<String> q = new DoubleLinkedDeque<>();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
    }

    @Test
    public void testMethods() {
        Deque<String> q = new DoubleLinkedDeque<>();
        q.insertFirst("a");
        q.insertFirst("b");
        q.traversal();
        q.insertLast("c");
        q.insertLast("d");
        q.traversal();

        System.out.println("------");
        System.out.println(q.removeFirst());
        q.traversal();
        System.out.println(q.removeLast());
        q.traversal();

        System.out.println("------");
        System.out.println(q.first());
        System.out.println(q.last());
        q.traversal();
    }

}