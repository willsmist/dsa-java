package com.csygl.dsa.list;

/**
 * 抛出该异常表示 *List* 为空
 */
public class ListEmptyException extends RuntimeException {

    public ListEmptyException(){
        super();
    }

    public ListEmptyException(String s){
        super(s);
    }
}
