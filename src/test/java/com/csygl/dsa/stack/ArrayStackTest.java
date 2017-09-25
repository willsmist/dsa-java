package com.csygl.dsa.stack;

import org.junit.Test;

import java.util.Arrays;

public class ArrayStackTest {
    @Test
    public void testFields() throws Exception {
        ArrayStack<String> stack = new ArrayStack<>(10);
        System.out.println("capacity=" + stack.capacity);
        System.out.println("top=" + stack.top);
        System.out.println(Arrays.toString(stack.s));
//        stack.traversal();
    }

    @Test
    public void testMethods() {
        ArrayStack<String> stack = new ArrayStack<>(3);
        stack.push("a");
        stack.traversal();
        stack.push("b");
        stack.traversal();
        stack.push("c");
        stack.traversal();
//        stack.push("d");

        System.out.println("-------");
        stack.traversal();
        System.out.println("-> " + stack.pop());
        stack.traversal();
        System.out.println("-> " + stack.pop());
        stack.traversal();
        System.out.println("-> " + stack.pop());
        stack.traversal();

        System.out.println("-------");
        stack.push("hello");
        stack.push("hello");
        System.out.println("<-> " + stack.top());
        stack.traversal();

    }
}