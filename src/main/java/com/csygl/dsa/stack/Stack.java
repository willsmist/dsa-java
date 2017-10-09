package com.csygl.dsa.stack;

/**
 * 栈 ADT 接口
 */
public interface Stack<E> {

    /**
     * 返回栈中元素数目
     *
     * @return 栈中元素数目
     */
    int getSize();

    /**
     * 判断栈是否为空
     *
     * @return true 表示栈非空, false 表示栈空
     */
    boolean isEmpty();

    /**
     * 使对象加入栈顶
     *
     * @param e 将要加入栈顶的对象
     */
    void push(E e);

    /**
     * 栈非空, 移除并返回栈顶元素
     * 栈空, 抛出 StackEmptyException
     *
     * @return 栈顶元素
     * @throws StackEmptyException 栈空异常
     */
    E pop() throws StackEmptyException;

    /**
     * 栈非空, 返回栈顶元素
     * 栈空, 抛出 StackEmptyException
     *
     * @return 栈顶元素
     * @throws StackEmptyException 栈空异常
     */
    E top() throws StackEmptyException;

    /**
     * 遍历栈中所有元素
     */
    void traversal();
}
