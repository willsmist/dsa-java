package com.csygl.dsa.common;

public class DLNode<E> implements Position<E> {

    //数据元素
    protected E element;

    //当前节点的直接前驱节点
    protected DLNode<E> prev;

    //当前节点的直接后继节点
    protected DLNode<E> next;

    public DLNode() {
        this(null, null, null);
    }

    public DLNode(E element, DLNode<E> prev, DLNode<E> next) {
        this.element = element;
        this.prev = prev;
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

    public DLNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DLNode<E> prev) {
        this.prev = prev;
    }

    public DLNode<E> getNext() {
        return next;
    }

    public void setNext(DLNode<E> next) {
        this.next = next;
    }
}
