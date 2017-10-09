package com.csygl.dsa.common;

/**
 * 单链表节点类
 */
public class Node<E> implements Position<E> {

    // 数据元素
    protected E element;

    // 当前结点的直接后继节点
    protected Node<E> next;

    public Node() {
        this(null, null);
    }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    /**
     * 返回当前节点保存的元素
     *
     * @return 该节点保存的元素
     */
    @Override
    public E getElement() {
        return element;
    }

    /**
     * 将指定的元素存放在当前节点，并将原来的元素返回
     *
     * @param e 新元素
     * @return 原来的元素
     */
    @Override
    public E setElement(E e) {
        E oldElement = element;
        element = e;
        return oldElement;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
