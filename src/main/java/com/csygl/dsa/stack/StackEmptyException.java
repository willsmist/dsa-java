package com.csygl.dsa.stack;

/**
 * 栈空异常
 */
public class StackEmptyException extends RuntimeException {

    public StackEmptyException() {
        super("stack is empty");
    }

    public StackEmptyException(String msg) {
        super(msg);
    }
}
