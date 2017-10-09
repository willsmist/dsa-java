package com.csygl.dsa.queue;

import com.csygl.dsa.common.Node;

/**
 * 基于单链表 SingleLinkedList 实现 Queue
 */
public class SingleLinkedListQueue<E> implements Queue<E> {

    //指向首节点
    protected Node<E> head;

    //指向末节点
    protected Node<E> tail;

    //队列中元素的个数
    protected int size;

    public SingleLinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * 获取队列中元素的个数
     *
     * @return 队列中元素的个数
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * 判断队列是否为空
     *
     * @return true 表示队列非空, false 表示队列空
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 入队
     * <p>
     * 将指定对象加入队列末端
     *
     * @param e 入队对象
     */
    @Override
    public void enqueue(E e) {
        Node<E> node = new Node<>(e, null);
        if (size == 0) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    /**
     * 出队
     * <p>
     * 若队列非空，则将队首元素移除,并将其返回
     * 否则，抛出异常
     *
     * @return 队首元素
     * @throws QueueEmptyException 队列空异常
     */
    @Override
    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        E element = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return element;
    }

    /**
     * 出队
     * <p>
     * 若队列非空，则将队首元素返回
     * 否则，抛出异常
     *
     * @return 队首元素
     * @throws QueueEmptyException 队列空异常
     */
    @Override
    public E front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return head.getElement();
    }

    /**
     * 遍历队列
     */
    @Override
    public void traversal() {
        Node p = head;
        while (p != null) {
            if (p.getNext() == null) {
                System.out.print(p.getElement());
            } else {
                System.out.print(p.getElement() + ", ");
            }
            p = p.getNext();
        }
        System.out.println();
    }
}
