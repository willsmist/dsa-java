package com.csygl.dsa.queue;

import com.csygl.dsa.common.DeNode;

/**
 * 基于双向链表实现 Deque
 */
public class DoubleLinkedListDeque<E> implements Deque<E> {

    //指向头节点(哨兵)
    protected DeNode<E> header;

    //指向尾节点(哨兵)
    protected DeNode<E> tailer;

    //队列中元素的个数
    protected int size;

    public DoubleLinkedListDeque() {
        header = new DeNode<>();
        tailer = new DeNode<>();
        header.setNext(tailer);
        tailer.setPrev(header);
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
     * 将新元素作为首元素插入
     *
     * @param e 新元素
     */
    @Override
    public void insertFirst(E e) {
        DeNode<E> node = new DeNode<>(e, header, header.getNext());
        header.getNext().setPrev(node);
        header.setNext((node));
        size++;
    }

    /**
     * 将新元素作为末元素插入
     *
     * @param e 新元素
     */
    @Override
    public void insertLast(E e) {
        DeNode<E> node = new DeNode<>(e, tailer.getPrev(), tailer);
        tailer.getPrev().setNext(node);
        tailer.setPrev(node);
        size++;
    }

    /**
     * 删除首元素并返回
     *
     * @return 首元素
     * @throws QueueEmptyException 队列空异常
     */
    @Override
    public E removeFirst() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        E element = header.getNext().getElement();
        header.getNext().getNext().setPrev(header);
        header.setNext(header.getNext().getNext());
        size--;
        return element;
    }

    /**
     * 删除末元素并返回
     *
     * @return 末元素
     * @throws QueueEmptyException 队列空异常
     */
    @Override
    public E removeLast() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        E element = tailer.getPrev().getElement();
        tailer.getPrev().getPrev().setNext(tailer);
        tailer.setPrev(tailer.getPrev().getPrev());
        size++;
        return element;
    }

    /**
     * 取首元素
     *
     * @return 首元素
     */
    @Override
    public E first() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return header.getNext().getElement();
    }

    /**
     * 取末元素
     *
     * @return 末元素
     */
    @Override
    public E last() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return tailer.getPrev().getElement();
    }

    /**
     * 遍历
     */
    @Override
    public void traversal() {
        DeNode<E> p = header.getNext();
        while (p != tailer) {
            if (p.getNext() == tailer) {
                System.out.println(p.getElement());
            } else {
                System.out.print(p.getElement() + ", ");

            }
            p = p.getNext();
        }
    }
}
