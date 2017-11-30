package com.csygl.dsa.list;

/**
 * 抛出该异常表示 *Position* 不合法
 */
public class PositionInvalidException extends RuntimeException{

    public PositionInvalidException(){
        super();
    }

    public PositionInvalidException(String s) {
        super(s);
    }
}
