package com.csygl.dsa.stack;

import org.junit.Test;

public class SingleLinkedListStackTest {
    @Test
    public void testFields() throws Exception {
        LinkedStack<String> stack = new LinkedStack<>();
        System.out.println("top=" + stack.top);
//        stack.traversal();
    }

    @Test
    public void testMethods() {
        LinkedStack<String> stack = new LinkedStack<>();
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