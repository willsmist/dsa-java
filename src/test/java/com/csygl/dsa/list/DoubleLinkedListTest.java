package com.csygl.dsa.list;

import com.csygl.dsa.common.DLNode;
import com.csygl.dsa.common.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {

    @Test
    public void test(){
        DoubleLinkedList<String> l = new DoubleLinkedList<>();
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());
        l.insertFirst("b");
        l.traverse();
        l.insertFirst("a");
        l.traverse();
        l.insertLast("c");
        l.traverse();
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());

        System.out.println(l.first().getElement());
        System.out.println(l.last().getElement());

        Position<String> aPos = l.first();
        l.insertBefore( aPos, "A");
        l.insertAfter( aPos, "B");
        l.traverse();
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());

        System.out.println(l.getNext(aPos).getElement());
        System.out.println(l.getPrev(aPos).getElement());

        System.out.println("------------------");
        l.traverse();
        l.remove(aPos);
        l.traverse();
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());
        l.removeFirst();
        l.traverse();
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());
        l.removeLast();
        l.traverse();
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());

        l.replace(l.first(), "111");
        l.traverse();
    }

}