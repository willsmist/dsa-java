package com.csygl.dsa.stack;

/**
 * 栈空异常
 */
public class StackEmptyException extends RuntimeException {

    public StackEmptyException() {
        super("com.csygl.dsa.stack.StackEmptyException: Stack is empty");
    }

    public StackEmptyException(String msg) {
        super(msg);
    }
}
