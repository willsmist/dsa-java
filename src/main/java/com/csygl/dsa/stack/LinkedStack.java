package com.csygl.dsa.stack;

import com.csygl.dsa.common.Node;

/**
 * 基于单链表实现 Stack
 *
 * @param <E>
 */
public class LinkedStack<E> implements Stack<E> {

    //指向栈顶元素
    protected Node<E> top;

    //栈中元素的个数
    protected int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * 返回栈中元素数目
     *
     * @return 栈中元素数目
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 判断栈是否为空
     *
     * @return true 表示栈非空, false 表示栈空
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * 使对象加入栈顶
     *
     * @param e 将要加入栈顶的对象
     */
    @Override
    public void push(E e) {
        top = new Node<>(e, top);
        size++;
    }

    /**
     * 栈非空, 移除并返回栈顶元素
     * 栈空, 抛出 StackEmptyException
     *
     * @return 栈顶元素
     * @throws StackEmptyException 栈空异常
     */
    @Override
    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        E element = top.getElement();
        top = top.getNext();
        size--;
        return element;
    }

    /**
     * 栈非空, 返回栈顶元素
     * 栈空, 抛出 StackEmptyException
     *
     * @return 栈顶元素
     * @throws StackEmptyException 栈空异常
     */
    @Override
    public E top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return top.getElement();
    }

    /**
     * 遍历栈中所有元素
     */
    @Override
    public void traversal() {
        Node<E> p = top;
        while (p != null) {
            if (p.getNext() == null) {
                System.out.println(p.getElement());
            } else {
                System.out.print(p.getElement() + ", ");
            }
            p = p.getNext();
        }
    }
}
