package com.csygl.dsa.list;

import com.csygl.dsa.common.DLNode;
import com.csygl.dsa.common.Iterator;
import com.csygl.dsa.common.Position;

/**
 * 基于双向链表实现列表 List
 *
 * @param <E> 类型参数
 */
public class DoubleLinkedList<E> implements List<E> {

    private int size;//列表中元素的数目

    private DLNode<E> header;//头节点(哨兵)

    private DLNode<E> tailer;//尾节点(哨兵)

    public DoubleLinkedList() {
        header = new DLNode<>();
        tailer = new DLNode<>();
        header.setNext(tailer);
        tailer.setPrev(header);
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Position<E> first() {
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        }
        return header.getNext();
    }

    @Override
    public Position<E> last() throws ListEmptyException {
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        }
        return tailer.getPrev();
    }

    //位置检查
    private DLNode<E> checkPosition(Position<E> pos) {
        if (pos == null) {
            throw new PositionInvalidException("PositionInvalidException: pos is null");
        }
        if (pos == header) {
            throw new PositionInvalidException("PositionInvalidException: pos is header");
        }
        if (pos == tailer) {
            throw new PositionInvalidException("PositionInvalidException: pos is tailer");
        }
        return (DLNode<E>) pos;
    }

    @Override
    public Position<E> getPrev(Position<E> pos) {
        DLNode<E> n = checkPosition(pos);
        DLNode<E> prev = n.getPrev();
        if (prev == header) {
            throw new BoundaryViolationException("企图越过列表前端");
        }
        return prev;
    }

    @Override
    public Position<E> getNext(Position<E> pos) {
        DLNode<E> n = checkPosition(pos);
        DLNode<E> next = n.getNext();
        if (next == tailer) {
            throw new BoundaryViolationException("企图越过列表后端");
        }
        return next;
    }

    @Override
    public Position<E> insertFirst(E e) {
        DLNode<E> newNode = new DLNode<>(e, header, header.getNext());
        header.getNext().setPrev(newNode);
        header.setNext(newNode);
        size++;
        return newNode;
//        return insertBefore(header.getNext(), e);
    }

    @Override
    public Position<E> insertLast(E e) {
        DLNode<E> newNode = new DLNode<>(e, tailer.getPrev(), tailer);
        tailer.getPrev().setNext(newNode);
        tailer.setPrev(newNode);
        size++;
        return newNode;
    }

    @Override
    public Position<E> insertAfter(Position<E> pos, E e) {
        DLNode<E> p = checkPosition(pos);
        DLNode<E> newNode = new DLNode<>(e, p, p.getNext());
        p.getNext().setPrev(newNode);
        p.setNext(newNode);
        size++;
        return newNode;
    }

    @Override
    public Position<E> insertBefore(Position<E> pos, E e) {
        DLNode<E> p = checkPosition(pos);
        DLNode<E> newNode = new DLNode<>(e, p.getPrev(), p);
        p.getPrev().setNext(newNode);
        p.setPrev(newNode);
        size++;
        return newNode;
    }

    @Override
    public E remove(Position<E> pos) {
        if(isEmpty()){
            throw new ListEmptyException("List is empty");
        }
        DLNode<E> p = checkPosition(pos);
        E element = p.getElement();
        p.getPrev().setNext(p.getNext());
        p.getNext().setPrev(p.getPrev());
        p.setPrev(null);
        p.setNext(null);
        size--;
        return element;
    }

    @Override
    public E removeFirst() {
//        if(isEmpty()){
//            throw new ListEmptyException("List is empty");
//        }
//        DLNode<E> p = header.getNext();
//        E element = p.getElement();
//        header.setNext(p.getNext());
//        p.getNext().setPrev(header);
//        p.setPrev(null);
//        p.setNext(null);
//        size--;
//        return element;
        return remove(header.getNext());
    }

    @Override
    public E removeLast() {
//        if(isEmpty()){
//            throw new ListEmptyException("List is empty");
//        }
//        DLNode<E> p = tailer.getPrev();
//        E element = p.getElement();
//        p.getPrev().setNext(tailer);
//        tailer.setPrev(p.getPrev());
//        p.setPrev(null);
//        p.setNext(null);
//        size--;
//        return element;
        return remove(tailer.getPrev());
    }

    @Override
    public E replace(Position<E> pos, E e) throws PositionInvalidException {
        DLNode<E> p = checkPosition(pos);
        E oldElement = p.getElement();
        p.setElement(e);
        return oldElement;
    }

    @Override
    public Iterator<E> positions() {
        return new PositionIterator<>();
    }

    @Override
    public Iterator<E> elements() {
        return new ElementIterator<>();
    }

    public void traverse(){
        DLNode<E> n = header.getNext();
        while(n != tailer){
            System.out.print(n.getElement() + " ");
            n = n.getNext();
        }
        System.out.println();
    }
}
